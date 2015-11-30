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

package com.github.frapontillo.pulse.crowd.plugin;

import com.github.frapontillo.pulse.crowd.data.entity.ProjectRun;
import com.github.frapontillo.pulse.util.DateUtil;
import com.github.frapontillo.pulse.util.ProcessUtil;
import com.github.frapontillo.pulse.util.PulseLogger;
import org.apache.logging.log4j.Logger;

import java.util.Date;

/**
 * @author Francesco Pontillo
 */
public class ProjectRunStartPlugin extends ProjectRunPlugin {
    public static final String PLUGIN_NAME = "project-run-start";
    private final Logger logger = PulseLogger.getLogger(ProjectRunStartPlugin.class);

    @Override public String getName() {
        return PLUGIN_NAME;
    }

    @Override protected void handleWake(ProjectRun projectRun, ProjectRunOptions parameters,
                                        boolean success) {
        projectRun.setDateStart(new Date());
        projectRun.setLog(parameters.getLog());
        projectRun.setPid(ProcessUtil.getPid());
        logger.info("Project run has started at {}.",
                DateUtil.toISOString(projectRun.getDateStart()));
    }
}
