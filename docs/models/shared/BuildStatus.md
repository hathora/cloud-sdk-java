# BuildStatus

Current status of your build.

`created`: a build was created but not yet run

`running`: the build process is actively executing

`succeeded`: the game server artifact was successfully built and stored in the Hathora registries

`failed`: the build process was unsuccessful, most likely due to an error with the `Dockerfile`


## Values

| Name        | Value       |
| ----------- | ----------- |
| `CREATED`   | created     |
| `RUNNING`   | running     |
| `SUCCEEDED` | succeeded   |
| `FAILED`    | failed      |