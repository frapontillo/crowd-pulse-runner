/*
 * Copyright 2015 Francesco Pontillo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.frapontillo.pulse.crowd.cli;

import com.beust.jcommander.Parameter;
import com.github.frapontillo.pulse.cli.BladeParameters;
import com.github.frapontillo.pulse.util.StringUtil;

/**
 * Command line parameters for the {@link CrowdBlade} runner, all optionals:
 * <ul>
 * <li>-c or --config, path to the configuration file; if not specified, the config file will be
 * read from the standard input</li>
 * <li>-r or --run, the ID of the current run, if specified the current run will be updated in the
 * database</li>
 * <li>-l or --log, file path to save logs to</li>
 * <li>-d or --db, connection string to the database where the run will be updated</li>
 * </ul>
 *
 * @author Francesco Pontillo
 */
public class CrowdBladeParameters extends BladeParameters {

    @Parameter(names = {"-r", "--run"},
            description = "The ID of the run owner of this execution") private String run;

    @Parameter(names = {"-d", "--db"},
            description = "Connection string to the database where runs are saved") private String
            db;

    public String getRun() {
        return run;
    }

    public String getDb() {
        return db;
    }

    public boolean mustSetProjectRun() {
        return (!StringUtil.isNullOrEmpty(run) && !StringUtil.isNullOrEmpty(run));
    }
}
