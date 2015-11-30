crowd-pulse-runner
==================

Crowd Pulse main runner.

------------------

This package introduces the `com.github.frapontillo.pulse.crowd.cli.CrowdBlade` class, that can be
used as the entry point for every Crowd Pulse configuration.

A Crowd Pulse configuration can then:

1. Specify this module as a dependency
2. Set `mainClassName = 'com.github.frapontillo.pulse.crowd.cli.CrowdBlade'` in `build.gradle`
3. Add any needed plugin as a `compile` dependency
4. Add resources as needed
5. Build
6. Profit!

You can also build the runner and manually add jars to the classpath (but do you even, dude?).

## License

```
  Copyright 2015 Francesco Pontillo

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.

```