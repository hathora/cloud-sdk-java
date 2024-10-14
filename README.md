<div align="center">
    <img src="https://user-images.githubusercontent.com/6267663/235110661-00e586cc-7489-4daf-82e8-7ae3c2c7143e.svg" width="350px">
    <h1> Java SDK</h1>
   <p>Serverless cloud hosting for multiplayer games</p>
   <a href="https://hathora.dev/docs"><img src="https://img.shields.io/static/v1?label=Docs&message=API Ref&color=000&style=for-the-badge" /></a>
   <a href="https://opensource.org/licenses/MIT"><img src="https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge" /></a>
   <a href="https://discord.com/invite/hathora"><img src="https://img.shields.io/static/v1?label=Discord&message=Join&color=7289da&style=for-the-badge" /></a>
</div>
<!-- Start Summary [summary] -->
## Summary

Hathora Cloud API: Welcome to the Hathora Cloud API documentation! Learn how to use the Hathora Cloud APIs to build and scale your game servers globally.
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents

* [SDK Installation](#sdk-installation)
* [SDK Example Usage](#sdk-example-usage)
* [Available Resources and Operations](#available-resources-and-operations)
* [Global Parameters](#global-parameters)
* [Error Handling](#error-handling)
* [Server Selection](#server-selection)
* [Authentication](#authentication)
<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'dev.hathora:cloud-sdk:2.10.2'
```

Maven:
```xml
<dependency>
    <groupId>dev.hathora</groupId>
    <artifactId>cloud-sdk</artifactId>
    <version>2.10.2</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateAppResponse;
import dev.hathora.cloud_sdk.models.shared.AppConfig;
import dev.hathora.cloud_sdk.models.shared.AuthConfiguration;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        CreateAppResponse res = sdk.appsV2().createApp()
                .appConfig(AppConfig.builder()
                    .appName("minecraft")
                    .authConfiguration(AuthConfiguration.builder()
                        .build())
                    .build())
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

        if (res.application().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [~~appsV1()~~](docs/sdks/appsv1/README.md)

* [~~createAppV1Deprecated~~](docs/sdks/appsv1/README.md#createappv1deprecated) - Create a new [application](https://hathora.dev/docs/concepts/hathora-entities#application). :warning: **Deprecated**
* [~~deleteAppV1Deprecated~~](docs/sdks/appsv1/README.md#deleteappv1deprecated) - Delete an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Your organization will lose access to this application. :warning: **Deprecated**
* [~~getAppInfoV1Deprecated~~](docs/sdks/appsv1/README.md#getappinfov1deprecated) - Get details for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. :warning: **Deprecated**
* [~~getAppsV1Deprecated~~](docs/sdks/appsv1/README.md#getappsv1deprecated) - Returns an unsorted list of your organization’s [applications](https://hathora.dev/docs/concepts/hathora-entities#application). An application is uniquely identified by an `appId`. :warning: **Deprecated**
* [~~updateAppV1Deprecated~~](docs/sdks/appsv1/README.md#updateappv1deprecated) - Update data for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. :warning: **Deprecated**

### [appsV2()](docs/sdks/appsv2/README.md)

* [createApp](docs/sdks/appsv2/README.md#createapp) - Create a new [application](https://hathora.dev/docs/concepts/hathora-entities#application).
* [deleteApp](docs/sdks/appsv2/README.md#deleteapp) - Delete an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Your organization will lose access to this application.
* [getApp](docs/sdks/appsv2/README.md#getapp) - Get details for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.
* [getApps](docs/sdks/appsv2/README.md#getapps) - Returns an unsorted list of your organization’s [applications](https://hathora.dev/docs/concepts/hathora-entities#application). An application is uniquely identified by an `appId`.
* [updateApp](docs/sdks/appsv2/README.md#updateapp) - Update data for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.

### [authV1()](docs/sdks/authv1/README.md)

* [loginAnonymous](docs/sdks/authv1/README.md#loginanonymous) - Returns a unique player token for an anonymous user.
* [loginGoogle](docs/sdks/authv1/README.md#logingoogle) - Returns a unique player token using a Google-signed OIDC `idToken`.
* [loginNickname](docs/sdks/authv1/README.md#loginnickname) - Returns a unique player token with a specified nickname for a user.

### [billingV1()](docs/sdks/billingv1/README.md)

* [getBalance](docs/sdks/billingv1/README.md#getbalance)
* [getInvoices](docs/sdks/billingv1/README.md#getinvoices)
* [getPaymentMethod](docs/sdks/billingv1/README.md#getpaymentmethod)
* [getUpcomingInvoiceItems](docs/sdks/billingv1/README.md#getupcominginvoiceitems)
* [getUpcomingInvoiceTotal](docs/sdks/billingv1/README.md#getupcominginvoicetotal)
* [initStripeCustomerPortalUrl](docs/sdks/billingv1/README.md#initstripecustomerportalurl)

### [~~buildsV1()~~](docs/sdks/buildsv1/README.md)

* [~~createBuildDeprecated~~](docs/sdks/buildsv1/README.md#createbuilddeprecated) - Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build). Responds with a `buildId` that you must pass to [`RunBuild()`](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build. :warning: **Deprecated**
* [~~deleteBuildDeprecated~~](docs/sdks/buildsv1/README.md#deletebuilddeprecated) - Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build). All associated metadata is deleted. :warning: **Deprecated**
* [~~getBuildInfoDeprecated~~](docs/sdks/buildsv1/README.md#getbuildinfodeprecated) - Get details for a [build](https://hathora.dev/docs/concepts/hathora-entities#build). :warning: **Deprecated**
* [~~getBuildsDeprecated~~](docs/sdks/buildsv1/README.md#getbuildsdeprecated) - Returns an array of [builds](https://hathora.dev/docs/concepts/hathora-entities#build) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). :warning: **Deprecated**
* [~~runBuildDeprecated~~](docs/sdks/buildsv1/README.md#runbuilddeprecated) - Builds a game server artifact from a tarball you provide. Pass in the `buildId` generated from [`CreateBuild()`](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild). :warning: **Deprecated**

### [~~buildsV2()~~](docs/sdks/buildsv2/README.md)

* [~~createBuildV2Deprecated~~](docs/sdks/buildsv2/README.md#createbuildv2deprecated) - Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build). Responds with a `buildId` that you must pass to [`RunBuild()`](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build. :warning: **Deprecated**
* [~~createBuildWithUploadUrlV2Deprecated~~](docs/sdks/buildsv2/README.md#createbuildwithuploadurlv2deprecated) - Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build) with `uploadUrl` that can be used to upload the build to before calling `runBuild`. Responds with a `buildId` that you must pass to [`RunBuild()`](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build. :warning: **Deprecated**
* [~~createWithMultipartUploadsV2Deprecated~~](docs/sdks/buildsv2/README.md#createwithmultipartuploadsv2deprecated) - Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build) with optional `multipartUploadUrls` that can be used to upload larger builds in parts before calling `runBuild`. Responds with a `buildId` that you must pass to [`RunBuild()`](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build. :warning: **Deprecated**
* [~~deleteBuildV2Deprecated~~](docs/sdks/buildsv2/README.md#deletebuildv2deprecated) - Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build). All associated metadata is deleted. :warning: **Deprecated**
* [~~getBuildInfoV2Deprecated~~](docs/sdks/buildsv2/README.md#getbuildinfov2deprecated) - Get details for a [build](https://hathora.dev/docs/concepts/hathora-entities#build). :warning: **Deprecated**
* [~~getBuildsV2Deprecated~~](docs/sdks/buildsv2/README.md#getbuildsv2deprecated) - Returns an array of [builds](https://hathora.dev/docs/concepts/hathora-entities#build) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). :warning: **Deprecated**
* [~~runBuildV2Deprecated~~](docs/sdks/buildsv2/README.md#runbuildv2deprecated) - Builds a game server artifact from a tarball you provide. Pass in the `buildId` generated from [`CreateBuild()`](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild). :warning: **Deprecated**

### [buildsV3()](docs/sdks/buildsv3/README.md)

* [createBuild](docs/sdks/buildsv3/README.md#createbuild) - Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build) with optional `multipartUploadUrls` that can be used to upload larger builds in parts before calling `runBuild`. Responds with a `buildId` that you must pass to [`RunBuild()`](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build.
* [deleteBuild](docs/sdks/buildsv3/README.md#deletebuild) - Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build). All associated metadata is deleted.
Be careful which builds you delete. This endpoint does not prevent you from deleting actively used builds.
Deleting a build that is actively build used by an app's deployment will cause failures when creating rooms.
* [getBuild](docs/sdks/buildsv3/README.md#getbuild) - Get details for a [build](https://hathora.dev/docs/concepts/hathora-entities#build).
* [getBuilds](docs/sdks/buildsv3/README.md#getbuilds) - Returns an array of [builds](https://hathora.dev/docs/concepts/hathora-entities#build) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).
* [runBuild](docs/sdks/buildsv3/README.md#runbuild) - Builds a game server artifact from a tarball you provide. Pass in the `buildId` generated from [`CreateBuild()`](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild).

### [~~deploymentsV1()~~](docs/sdks/deploymentsv1/README.md)

* [~~createDeploymentV1Deprecated~~](docs/sdks/deploymentsv1/README.md#createdeploymentv1deprecated) - Create a new [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment). Creating a new deployment means all new rooms created will use the latest deployment configuration, but existing games in progress will not be affected. :warning: **Deprecated**
* [~~getDeploymentInfoV1Deprecated~~](docs/sdks/deploymentsv1/README.md#getdeploymentinfov1deprecated) - Get details for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment). :warning: **Deprecated**
* [~~getDeploymentsV1Deprecated~~](docs/sdks/deploymentsv1/README.md#getdeploymentsv1deprecated) - Returns an array of [deployments](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). :warning: **Deprecated**
* [~~getLatestDeploymentV1Deprecated~~](docs/sdks/deploymentsv1/README.md#getlatestdeploymentv1deprecated) - Get the latest [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). :warning: **Deprecated**

### [~~deploymentsV2()~~](docs/sdks/deploymentsv2/README.md)

* [~~createDeploymentV2Deprecated~~](docs/sdks/deploymentsv2/README.md#createdeploymentv2deprecated) - Create a new [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment). Creating a new deployment means all new rooms created will use the latest deployment configuration, but existing games in progress will not be affected. :warning: **Deprecated**
* [~~getDeploymentInfoV2Deprecated~~](docs/sdks/deploymentsv2/README.md#getdeploymentinfov2deprecated) - Get details for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment). :warning: **Deprecated**
* [~~getDeploymentsV2Deprecated~~](docs/sdks/deploymentsv2/README.md#getdeploymentsv2deprecated) - Returns an array of [deployments](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). :warning: **Deprecated**
* [~~getLatestDeploymentV2Deprecated~~](docs/sdks/deploymentsv2/README.md#getlatestdeploymentv2deprecated) - Get the latest [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). :warning: **Deprecated**

### [deploymentsV3()](docs/sdks/deploymentsv3/README.md)

* [createDeployment](docs/sdks/deploymentsv3/README.md#createdeployment) - Create a new [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment). Creating a new deployment means all new rooms created will use the latest deployment configuration, but existing games in progress will not be affected.
* [getDeployment](docs/sdks/deploymentsv3/README.md#getdeployment) - Get details for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment).
* [getDeployments](docs/sdks/deploymentsv3/README.md#getdeployments) - Returns an array of [deployments](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).
* [getLatestDeployment](docs/sdks/deploymentsv3/README.md#getlatestdeployment) - Get the latest [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).

### [~~discoveryV1()~~](docs/sdks/discoveryv1/README.md)

* [~~getPingServiceEndpointsDeprecated~~](docs/sdks/discoveryv1/README.md#getpingserviceendpointsdeprecated) - Returns an array of V1 regions with a host and port that a client can directly ping. Open a websocket connection to `wss://<host>:<port>/ws` and send a packet. To calculate ping, measure the time it takes to get an echo packet back. :warning: **Deprecated**

### [discoveryV2()](docs/sdks/discoveryv2/README.md)

* [getPingServiceEndpoints](docs/sdks/discoveryv2/README.md#getpingserviceendpoints) - Returns an array of all regions with a host and port that a client can directly ping. Open a websocket connection to `wss://<host>:<port>/ws` and send a packet. To calculate ping, measure the time it takes to get an echo packet back.

### [fleetsV1()](docs/sdks/fleetsv1/README.md)

* [getFleetMetrics](docs/sdks/fleetsv1/README.md#getfleetmetrics) - Gets metrics for a [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet) in a region.
* [getFleetRegion](docs/sdks/fleetsv1/README.md#getfleetregion) - Gets the configuration for a given [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet) in a region.
* [getFleets](docs/sdks/fleetsv1/README.md#getfleets) - Returns an array of [fleets](https://hathora.dev/docs/concepts/hathora-entities#fleet).
* [updateFleetRegion](docs/sdks/fleetsv1/README.md#updatefleetregion) - Updates the configuration for a given [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet) in a region.


### [~~lobbiesV1()~~](docs/sdks/lobbiesv1/README.md)

* [~~createPrivateLobbyDeprecated~~](docs/sdks/lobbiesv1/README.md#createprivatelobbydeprecated) - :warning: **Deprecated**
* [~~createPublicLobbyDeprecated~~](docs/sdks/lobbiesv1/README.md#createpubliclobbydeprecated) - :warning: **Deprecated**
* [~~listActivePublicLobbiesDeprecatedV1~~](docs/sdks/lobbiesv1/README.md#listactivepubliclobbiesdeprecatedv1) - :warning: **Deprecated**

### [~~lobbiesV2()~~](docs/sdks/lobbiesv2/README.md)

* [~~createLobbyDeprecated~~](docs/sdks/lobbiesv2/README.md#createlobbydeprecated) - Create a new lobby for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). A lobby object is a wrapper around a [room](https://hathora.dev/docs/concepts/hathora-entities#room) object. With a lobby, you get additional functionality like configuring the visibility of the room, managing the state of a match, and retrieving a list of public lobbies to display to players. :warning: **Deprecated**
* [~~createLocalLobby~~](docs/sdks/lobbiesv2/README.md#createlocallobby) - :warning: **Deprecated**
* [~~createPrivateLobby~~](docs/sdks/lobbiesv2/README.md#createprivatelobby) - :warning: **Deprecated**
* [~~createPublicLobby~~](docs/sdks/lobbiesv2/README.md#createpubliclobby) - :warning: **Deprecated**
* [~~getLobbyInfo~~](docs/sdks/lobbiesv2/README.md#getlobbyinfo) - Get details for a lobby. :warning: **Deprecated**
* [~~listActivePublicLobbiesDeprecatedV2~~](docs/sdks/lobbiesv2/README.md#listactivepubliclobbiesdeprecatedv2) - Get all active lobbies for a an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter by optionally passing in a `region`. Use this endpoint to display all public lobbies that a player can join in the game client. :warning: **Deprecated**
* [~~setLobbyState~~](docs/sdks/lobbiesv2/README.md#setlobbystate) - Set the state of a lobby. State is intended to be set by the server and must be smaller than 1MB. Use this endpoint to store match data like live player count to enforce max number of clients or persist end-game data (i.e. winner or final scores). :warning: **Deprecated**

### [lobbiesV3()](docs/sdks/lobbiesv3/README.md)

* [createLobby](docs/sdks/lobbiesv3/README.md#createlobby) - Create a new lobby for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). A lobby object is a wrapper around a [room](https://hathora.dev/docs/concepts/hathora-entities#room) object. With a lobby, you get additional functionality like configuring the visibility of the room, managing the state of a match, and retrieving a list of public lobbies to display to players.
* [getLobbyInfoByRoomId](docs/sdks/lobbiesv3/README.md#getlobbyinfobyroomid) - Get details for a lobby.
* [getLobbyInfoByShortCode](docs/sdks/lobbiesv3/README.md#getlobbyinfobyshortcode) - Get details for a lobby. If 2 or more lobbies have the same `shortCode`, then the most recently created lobby will be returned.
* [listActivePublicLobbies](docs/sdks/lobbiesv3/README.md#listactivepubliclobbies) - Get all active lobbies for a given [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`. Use this endpoint to display all public lobbies that a player can join in the game client.

### [logsV1()](docs/sdks/logsv1/README.md)

* [downloadLogForProcess](docs/sdks/logsv1/README.md#downloadlogforprocess) - Download entire log file for a stopped process.
* [~~getLogsForApp~~](docs/sdks/logsv1/README.md#getlogsforapp) - Returns a stream of logs for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. :warning: **Deprecated**
* [~~getLogsForDeployment~~](docs/sdks/logsv1/README.md#getlogsfordeployment) - Returns a stream of logs for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) using `appId` and `deploymentId`. :warning: **Deprecated**
* [getLogsForProcess](docs/sdks/logsv1/README.md#getlogsforprocess) - Returns a stream of logs for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.

### [managementV1()](docs/sdks/managementv1/README.md)

* [sendVerificationEmail](docs/sdks/managementv1/README.md#sendverificationemail)

### [~~metricsV1()~~](docs/sdks/metricsv1/README.md)

* [~~getMetricsDeprecated~~](docs/sdks/metricsv1/README.md#getmetricsdeprecated) - Get metrics for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`. :warning: **Deprecated**

### [organizationsV1()](docs/sdks/organizationsv1/README.md)

* [acceptInvite](docs/sdks/organizationsv1/README.md#acceptinvite)
* [getOrgMembers](docs/sdks/organizationsv1/README.md#getorgmembers)
* [getOrgPendingInvites](docs/sdks/organizationsv1/README.md#getorgpendinginvites)
* [getOrgs](docs/sdks/organizationsv1/README.md#getorgs) - Returns an unsorted list of all organizations that you are a member of (an accepted membership invite). An organization is uniquely identified by an `orgId`.
* [getUserPendingInvites](docs/sdks/organizationsv1/README.md#getuserpendinginvites)
* [inviteUser](docs/sdks/organizationsv1/README.md#inviteuser)
* [rejectInvite](docs/sdks/organizationsv1/README.md#rejectinvite)
* [rescindInvite](docs/sdks/organizationsv1/README.md#rescindinvite)

### [~~processesV1()~~](docs/sdks/processesv1/README.md)

* [~~getProcessInfoDeprecated~~](docs/sdks/processesv1/README.md#getprocessinfodeprecated) - Get details for a [process](https://hathora.dev/docs/concepts/hathora-entities#process). :warning: **Deprecated**
* [~~getRunningProcesses~~](docs/sdks/processesv1/README.md#getrunningprocesses) - Retrieve 10 most recently started [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`. :warning: **Deprecated**
* [~~getStoppedProcesses~~](docs/sdks/processesv1/README.md#getstoppedprocesses) - Retrieve 10 most recently stopped [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`. :warning: **Deprecated**

### [~~processesV2()~~](docs/sdks/processesv2/README.md)

* [~~createProcessV2Deprecated~~](docs/sdks/processesv2/README.md#createprocessv2deprecated) - Creates a [process](https://hathora.dev/docs/concepts/hathora-entities#process) without a room. Use this to pre-allocate processes ahead of time so that subsequent room assignment via [CreateRoom()](https://hathora.dev/api#tag/RoomV2/operation/CreateRoom) can be instant. :warning: **Deprecated**
* [~~getLatestProcessesV2Deprecated~~](docs/sdks/processesv2/README.md#getlatestprocessesv2deprecated) - Retrieve the 10 most recent [processes](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `status` or `region`. :warning: **Deprecated**
* [~~getProcessInfoV2Deprecated~~](docs/sdks/processesv2/README.md#getprocessinfov2deprecated) - Get details for a [process](https://hathora.dev/docs/concepts/hathora-entities#process). :warning: **Deprecated**
* [~~getProcessesCountExperimentalV2Deprecated~~](docs/sdks/processesv2/README.md#getprocessescountexperimentalv2deprecated) - Count the number of [processes](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter by optionally passing in a `status` or `region`. :warning: **Deprecated**
* [~~stopProcessV2Deprecated~~](docs/sdks/processesv2/README.md#stopprocessv2deprecated) - Stops a [process](https://hathora.dev/docs/concepts/hathora-entities#process) immediately. :warning: **Deprecated**

### [processesV3()](docs/sdks/processesv3/README.md)

* [createProcess](docs/sdks/processesv3/README.md#createprocess) - Creates a [process](https://hathora.dev/docs/concepts/hathora-entities#process) without a room. Use this to pre-allocate processes ahead of time so that subsequent room assignment via [CreateRoom()](https://hathora.dev/api#tag/RoomV2/operation/CreateRoom) can be instant.
* [getLatestProcesses](docs/sdks/processesv3/README.md#getlatestprocesses) - Retrieve the 10 most recent [processes](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `status` or `region`.
* [getProcess](docs/sdks/processesv3/README.md#getprocess) - Get details for a [process](https://hathora.dev/docs/concepts/hathora-entities#process).
* [getProcessMetrics](docs/sdks/processesv3/README.md#getprocessmetrics)
* [getProcessesCountExperimental](docs/sdks/processesv3/README.md#getprocessescountexperimental) - Count the number of [processes](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter by optionally passing in a `status` or `region`.
* [stopProcess](docs/sdks/processesv3/README.md#stopprocess) - Stops a [process](https://hathora.dev/docs/concepts/hathora-entities#process) immediately.

### [~~roomsV1()~~](docs/sdks/roomsv1/README.md)

* [~~createRoomDeprecated~~](docs/sdks/roomsv1/README.md#createroomdeprecated) - :warning: **Deprecated**
* [~~destroyRoomDeprecated~~](docs/sdks/roomsv1/README.md#destroyroomdeprecated) - :warning: **Deprecated**
* [~~getActiveRoomsForProcessDeprecated~~](docs/sdks/roomsv1/README.md#getactiveroomsforprocessdeprecated) - :warning: **Deprecated**
* [~~getConnectionInfoDeprecated~~](docs/sdks/roomsv1/README.md#getconnectioninfodeprecated) - :warning: **Deprecated**
* [~~getInactiveRoomsForProcessDeprecated~~](docs/sdks/roomsv1/README.md#getinactiveroomsforprocessdeprecated) - :warning: **Deprecated**
* [~~getRoomInfoDeprecated~~](docs/sdks/roomsv1/README.md#getroominfodeprecated) - :warning: **Deprecated**
* [~~suspendRoomDeprecated~~](docs/sdks/roomsv1/README.md#suspendroomdeprecated) - :warning: **Deprecated**

### [roomsV2()](docs/sdks/roomsv2/README.md)

* [createRoom](docs/sdks/roomsv2/README.md#createroom) - Create a new [room](https://hathora.dev/docs/concepts/hathora-entities#room) for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application). Poll the [`GetConnectionInfo()`](https://hathora.dev/api#tag/RoomV2/operation/GetConnectionInfo) endpoint to get connection details for an active room.
* [destroyRoom](docs/sdks/roomsv2/README.md#destroyroom) - Destroy a [room](https://hathora.dev/docs/concepts/hathora-entities#room). All associated metadata is deleted.
* [getActiveRoomsForProcess](docs/sdks/roomsv2/README.md#getactiveroomsforprocess) - Get all active [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) for a given [process](https://hathora.dev/docs/concepts/hathora-entities#process).
* [getConnectionInfo](docs/sdks/roomsv2/README.md#getconnectioninfo) - Poll this endpoint to get connection details to a [room](https://hathora.dev/docs/concepts/hathora-entities#room). Clients can call this endpoint without authentication.
* [getInactiveRoomsForProcess](docs/sdks/roomsv2/README.md#getinactiveroomsforprocess) - Get all inactive [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) for a given [process](https://hathora.dev/docs/concepts/hathora-entities#process).
* [getRoomInfo](docs/sdks/roomsv2/README.md#getroominfo) - Retreive current and historical allocation data for a [room](https://hathora.dev/docs/concepts/hathora-entities#room).
* [~~suspendRoomV2Deprecated~~](docs/sdks/roomsv2/README.md#suspendroomv2deprecated) - Suspend a [room](https://hathora.dev/docs/concepts/hathora-entities#room). The room is unallocated from the process but can be rescheduled later using the same `roomId`. :warning: **Deprecated**
* [updateRoomConfig](docs/sdks/roomsv2/README.md#updateroomconfig)

### [tokensV1()](docs/sdks/tokensv1/README.md)

* [createOrgToken](docs/sdks/tokensv1/README.md#createorgtoken) - Create a new organization token.
* [getOrgTokens](docs/sdks/tokensv1/README.md#getorgtokens) - List all organization tokens for a given org.
* [revokeOrgToken](docs/sdks/tokensv1/README.md#revokeorgtoken) - Revoke an organization token.

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

A parameter is configured globally. This parameter may be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, This global value will be used as the default on the operations that use it. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `appId` to `"app-af469a92-5b45-4565-b3c4-b79878de67d2"` at SDK initialization and then you do not have to pass the same value on calls to operations like `deleteApp`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameter is available.

| Name | Type | Required | Description |
| ---- | ---- |:--------:| ----------- |
| appId | java.lang.String |  | The appId parameter. |


### Example

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.DeleteAppResponse;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        DeleteAppResponse res = sdk.appsV2().deleteApp()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .call();

        // handle response
    }
}
```
<!-- End Global Parameters [global-parameters] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/SDKError` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `createApp` method throws the following exceptions:

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| models/errors/ApiError  | 401, 404, 422, 429, 500 | application/json        |
| models/errors/SDKError  | 4XX, 5XX                | \*/\*                   |

### Example

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateAppResponse;
import dev.hathora.cloud_sdk.models.shared.AppConfig;
import dev.hathora.cloud_sdk.models.shared.AuthConfiguration;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        CreateAppResponse res = sdk.appsV2().createApp()
                .appConfig(AppConfig.builder()
                    .appName("minecraft")
                    .authConfiguration(AuthConfiguration.builder()
                        .build())
                    .build())
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

        if (res.application().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIndex` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `https://api.hathora.dev` | None |
| 1 | `https:///` | None |

#### Example

```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateAppResponse;
import dev.hathora.cloud_sdk.models.shared.AppConfig;
import dev.hathora.cloud_sdk.models.shared.AuthConfiguration;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .serverIndex(1)
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        CreateAppResponse res = sdk.appsV2().createApp()
                .appConfig(AppConfig.builder()
                    .appName("minecraft")
                    .authConfiguration(AuthConfiguration.builder()
                        .build())
                    .build())
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

        if (res.application().isPresent()) {
            // handle response
        }
    }
}
```


### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverURL` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateAppResponse;
import dev.hathora.cloud_sdk.models.shared.AppConfig;
import dev.hathora.cloud_sdk.models.shared.AuthConfiguration;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .serverURL("https://api.hathora.dev")
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        CreateAppResponse res = sdk.appsV2().createApp()
                .appConfig(AppConfig.builder()
                    .appName("minecraft")
                    .authConfiguration(AuthConfiguration.builder()
                        .build())
                    .build())
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

        if (res.application().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name              | Type              | Scheme            |
| ----------------- | ----------------- | ----------------- |
| `hathoraDevToken` | http              | HTTP Bearer       |

You can set the security parameters through the `security` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateAppResponse;
import dev.hathora.cloud_sdk.models.shared.AppConfig;
import dev.hathora.cloud_sdk.models.shared.AuthConfiguration;
import dev.hathora.cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        CreateAppResponse res = sdk.appsV2().createApp()
                .appConfig(AppConfig.builder()
                    .appName("minecraft")
                    .authConfiguration(AuthConfiguration.builder()
                        .build())
                    .build())
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .call();

        if (res.application().isPresent()) {
            // handle response
        }
    }
}
```

### Per-Operation Security Schemes

Some operations in this SDK require the security scheme to be specified at the request level. For example:
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.operations.CreateLobbyRequest;
import dev.hathora.cloud_sdk.models.operations.CreateLobbyResponse;
import dev.hathora.cloud_sdk.models.operations.CreateLobbySecurity;
import dev.hathora.cloud_sdk.models.shared.CreateLobbyV3Params;
import dev.hathora.cloud_sdk.models.shared.LobbyVisibility;
import dev.hathora.cloud_sdk.models.shared.Region;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        CreateLobbyRequest req = CreateLobbyRequest.builder()
                .createLobbyV3Params(CreateLobbyV3Params.builder()
                    .region(Region.SEATTLE)
                    .visibility(LobbyVisibility.PRIVATE)
                    .roomConfig("{\"name\":\"my-room\"}")
                    .build())
                .roomId("2swovpy1fnunu")
                .shortCode("LFG4")
                .build();

        CreateLobbyResponse res = sdk.lobbiesV3().createLobby()
                .request(req)
                .security(CreateLobbySecurity.builder()
                    .playerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .call();

        if (res.lobbyV3().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Authentication [security] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
