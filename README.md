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
<!-- $toc-max-depth=2 -->
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
implementation 'dev.hathora:cloud-sdk:2.14.7'
```

Maven:
```xml
<dependency>
    <groupId>dev.hathora</groupId>
    <artifactId>cloud-sdk</artifactId>
    <version>2.14.7</version>
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

    public static void main(String[] args) throws ApiError, ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
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

* [~~createAppV1Deprecated~~](docs/sdks/appsv1/README.md#createappv1deprecated) - CreateAppV1Deprecated :warning: **Deprecated**
* [~~deleteAppV1Deprecated~~](docs/sdks/appsv1/README.md#deleteappv1deprecated) - DeleteAppV1Deprecated :warning: **Deprecated**
* [~~getAppInfoV1Deprecated~~](docs/sdks/appsv1/README.md#getappinfov1deprecated) - GetAppInfoV1Deprecated :warning: **Deprecated**
* [~~getAppsV1Deprecated~~](docs/sdks/appsv1/README.md#getappsv1deprecated) - GetAppsV1Deprecated :warning: **Deprecated**
* [~~updateAppV1Deprecated~~](docs/sdks/appsv1/README.md#updateappv1deprecated) - UpdateAppV1Deprecated :warning: **Deprecated**

### [appsV2()](docs/sdks/appsv2/README.md)

* [createApp](docs/sdks/appsv2/README.md#createapp) - CreateApp
* [deleteApp](docs/sdks/appsv2/README.md#deleteapp) - DeleteApp
* [getApp](docs/sdks/appsv2/README.md#getapp) - GetApp
* [getApps](docs/sdks/appsv2/README.md#getapps) - GetApps
* [updateApp](docs/sdks/appsv2/README.md#updateapp) - UpdateApp

### [authV1()](docs/sdks/authv1/README.md)

* [loginAnonymous](docs/sdks/authv1/README.md#loginanonymous) - LoginAnonymous
* [loginGoogle](docs/sdks/authv1/README.md#logingoogle) - LoginGoogle
* [loginNickname](docs/sdks/authv1/README.md#loginnickname) - LoginNickname

### [billingV1()](docs/sdks/billingv1/README.md)

* [~~getBalance~~](docs/sdks/billingv1/README.md#getbalance) - GetBalance :warning: **Deprecated**
* [getInvoices](docs/sdks/billingv1/README.md#getinvoices) - GetInvoices
* [getPaymentMethod](docs/sdks/billingv1/README.md#getpaymentmethod) - GetPaymentMethod
* [getUpcomingInvoiceItems](docs/sdks/billingv1/README.md#getupcominginvoiceitems) - GetUpcomingInvoiceItems
* [getUpcomingInvoiceTotal](docs/sdks/billingv1/README.md#getupcominginvoicetotal) - GetUpcomingInvoiceTotal
* [initStripeCustomerPortalUrl](docs/sdks/billingv1/README.md#initstripecustomerportalurl) - InitStripeCustomerPortalUrl

### [~~buildsV1()~~](docs/sdks/buildsv1/README.md)

* [~~createBuildDeprecated~~](docs/sdks/buildsv1/README.md#createbuilddeprecated) - CreateBuildDeprecated :warning: **Deprecated**
* [~~deleteBuildDeprecated~~](docs/sdks/buildsv1/README.md#deletebuilddeprecated) - DeleteBuildDeprecated :warning: **Deprecated**
* [~~getBuildInfoDeprecated~~](docs/sdks/buildsv1/README.md#getbuildinfodeprecated) - GetBuildInfoDeprecated :warning: **Deprecated**
* [~~getBuildsDeprecated~~](docs/sdks/buildsv1/README.md#getbuildsdeprecated) - GetBuildsDeprecated :warning: **Deprecated**
* [~~runBuildDeprecated~~](docs/sdks/buildsv1/README.md#runbuilddeprecated) - RunBuildDeprecated :warning: **Deprecated**

### [~~buildsV2()~~](docs/sdks/buildsv2/README.md)

* [~~createBuildV2Deprecated~~](docs/sdks/buildsv2/README.md#createbuildv2deprecated) - CreateBuildV2Deprecated :warning: **Deprecated**
* [~~createBuildWithUploadUrlV2Deprecated~~](docs/sdks/buildsv2/README.md#createbuildwithuploadurlv2deprecated) - CreateBuildWithUploadUrlV2Deprecated :warning: **Deprecated**
* [~~createWithMultipartUploadsV2Deprecated~~](docs/sdks/buildsv2/README.md#createwithmultipartuploadsv2deprecated) - CreateWithMultipartUploadsV2Deprecated :warning: **Deprecated**
* [~~deleteBuildV2Deprecated~~](docs/sdks/buildsv2/README.md#deletebuildv2deprecated) - DeleteBuildV2Deprecated :warning: **Deprecated**
* [~~getBuildInfoV2Deprecated~~](docs/sdks/buildsv2/README.md#getbuildinfov2deprecated) - GetBuildInfoV2Deprecated :warning: **Deprecated**
* [~~getBuildsV2Deprecated~~](docs/sdks/buildsv2/README.md#getbuildsv2deprecated) - GetBuildsV2Deprecated :warning: **Deprecated**
* [~~runBuildV2Deprecated~~](docs/sdks/buildsv2/README.md#runbuildv2deprecated) - RunBuildV2Deprecated :warning: **Deprecated**

### [buildsV3()](docs/sdks/buildsv3/README.md)

* [createBuild](docs/sdks/buildsv3/README.md#createbuild) - CreateBuild
* [deleteBuild](docs/sdks/buildsv3/README.md#deletebuild) - DeleteBuild
* [getBuild](docs/sdks/buildsv3/README.md#getbuild) - GetBuild
* [getBuilds](docs/sdks/buildsv3/README.md#getbuilds) - GetBuilds
* [runBuild](docs/sdks/buildsv3/README.md#runbuild) - RunBuild

### [~~deploymentsV1()~~](docs/sdks/deploymentsv1/README.md)

* [~~createDeploymentV1Deprecated~~](docs/sdks/deploymentsv1/README.md#createdeploymentv1deprecated) - CreateDeploymentV1Deprecated :warning: **Deprecated**
* [~~getDeploymentInfoV1Deprecated~~](docs/sdks/deploymentsv1/README.md#getdeploymentinfov1deprecated) - GetDeploymentInfoV1Deprecated :warning: **Deprecated**
* [~~getDeploymentsV1Deprecated~~](docs/sdks/deploymentsv1/README.md#getdeploymentsv1deprecated) - GetDeploymentsV1Deprecated :warning: **Deprecated**
* [~~getLatestDeploymentV1Deprecated~~](docs/sdks/deploymentsv1/README.md#getlatestdeploymentv1deprecated) - GetLatestDeploymentV1Deprecated :warning: **Deprecated**

### [~~deploymentsV2()~~](docs/sdks/deploymentsv2/README.md)

* [~~createDeploymentV2Deprecated~~](docs/sdks/deploymentsv2/README.md#createdeploymentv2deprecated) - CreateDeploymentV2Deprecated :warning: **Deprecated**
* [~~getDeploymentInfoV2Deprecated~~](docs/sdks/deploymentsv2/README.md#getdeploymentinfov2deprecated) - GetDeploymentInfoV2Deprecated :warning: **Deprecated**
* [~~getDeploymentsV2Deprecated~~](docs/sdks/deploymentsv2/README.md#getdeploymentsv2deprecated) - GetDeploymentsV2Deprecated :warning: **Deprecated**
* [~~getLatestDeploymentV2Deprecated~~](docs/sdks/deploymentsv2/README.md#getlatestdeploymentv2deprecated) - GetLatestDeploymentV2Deprecated :warning: **Deprecated**

### [deploymentsV3()](docs/sdks/deploymentsv3/README.md)

* [createDeployment](docs/sdks/deploymentsv3/README.md#createdeployment) - CreateDeployment
* [getDeployment](docs/sdks/deploymentsv3/README.md#getdeployment) - GetDeployment
* [getDeployments](docs/sdks/deploymentsv3/README.md#getdeployments) - GetDeployments
* [getLatestDeployment](docs/sdks/deploymentsv3/README.md#getlatestdeployment) - GetLatestDeployment

### [~~discoveryV1()~~](docs/sdks/discoveryv1/README.md)

* [~~getPingServiceEndpointsDeprecated~~](docs/sdks/discoveryv1/README.md#getpingserviceendpointsdeprecated) - GetPingServiceEndpointsDeprecated :warning: **Deprecated**

### [discoveryV2()](docs/sdks/discoveryv2/README.md)

* [getPingServiceEndpoints](docs/sdks/discoveryv2/README.md#getpingserviceendpoints) - GetPingServiceEndpoints

### [fleetsV1()](docs/sdks/fleetsv1/README.md)

* [getFleetMetrics](docs/sdks/fleetsv1/README.md#getfleetmetrics) - GetFleetMetrics
* [getFleetRegion](docs/sdks/fleetsv1/README.md#getfleetregion) - GetFleetRegion
* [getFleets](docs/sdks/fleetsv1/README.md#getfleets) - GetFleets
* [updateFleetRegion](docs/sdks/fleetsv1/README.md#updatefleetregion) - UpdateFleetRegion


### [~~lobbiesV1()~~](docs/sdks/lobbiesv1/README.md)

* [~~createPrivateLobbyDeprecated~~](docs/sdks/lobbiesv1/README.md#createprivatelobbydeprecated) - CreatePrivateLobbyDeprecated :warning: **Deprecated**
* [~~createPublicLobbyDeprecated~~](docs/sdks/lobbiesv1/README.md#createpubliclobbydeprecated) - CreatePublicLobbyDeprecated :warning: **Deprecated**
* [~~listActivePublicLobbiesDeprecatedV1~~](docs/sdks/lobbiesv1/README.md#listactivepubliclobbiesdeprecatedv1) - ListActivePublicLobbiesDeprecatedV1 :warning: **Deprecated**

### [~~lobbiesV2()~~](docs/sdks/lobbiesv2/README.md)

* [~~createLobbyDeprecated~~](docs/sdks/lobbiesv2/README.md#createlobbydeprecated) - CreateLobbyDeprecated :warning: **Deprecated**
* [~~createLocalLobby~~](docs/sdks/lobbiesv2/README.md#createlocallobby) - CreateLocalLobby :warning: **Deprecated**
* [~~createPrivateLobby~~](docs/sdks/lobbiesv2/README.md#createprivatelobby) - CreatePrivateLobby :warning: **Deprecated**
* [~~createPublicLobby~~](docs/sdks/lobbiesv2/README.md#createpubliclobby) - CreatePublicLobby :warning: **Deprecated**
* [~~getLobbyInfo~~](docs/sdks/lobbiesv2/README.md#getlobbyinfo) - GetLobbyInfo :warning: **Deprecated**
* [~~listActivePublicLobbiesDeprecatedV2~~](docs/sdks/lobbiesv2/README.md#listactivepubliclobbiesdeprecatedv2) - ListActivePublicLobbiesDeprecatedV2 :warning: **Deprecated**
* [~~setLobbyState~~](docs/sdks/lobbiesv2/README.md#setlobbystate) - SetLobbyState :warning: **Deprecated**

### [lobbiesV3()](docs/sdks/lobbiesv3/README.md)

* [createLobby](docs/sdks/lobbiesv3/README.md#createlobby) - CreateLobby
* [getLobbyInfoByRoomId](docs/sdks/lobbiesv3/README.md#getlobbyinfobyroomid) - GetLobbyInfoByRoomId
* [getLobbyInfoByShortCode](docs/sdks/lobbiesv3/README.md#getlobbyinfobyshortcode) - GetLobbyInfoByShortCode
* [listActivePublicLobbies](docs/sdks/lobbiesv3/README.md#listactivepubliclobbies) - ListActivePublicLobbies

### [logsV1()](docs/sdks/logsv1/README.md)

* [downloadLogForProcess](docs/sdks/logsv1/README.md#downloadlogforprocess) - DownloadLogForProcess
* [getLogsForProcess](docs/sdks/logsv1/README.md#getlogsforprocess) - GetLogsForProcess

### [managementV1()](docs/sdks/managementv1/README.md)

* [sendVerificationEmail](docs/sdks/managementv1/README.md#sendverificationemail) - SendVerificationEmail

### [~~metricsV1()~~](docs/sdks/metricsv1/README.md)

* [~~getMetricsDeprecated~~](docs/sdks/metricsv1/README.md#getmetricsdeprecated) - GetMetricsDeprecated :warning: **Deprecated**

### [organizationsV1()](docs/sdks/organizationsv1/README.md)

* [acceptInvite](docs/sdks/organizationsv1/README.md#acceptinvite) - AcceptInvite
* [getOrgMembers](docs/sdks/organizationsv1/README.md#getorgmembers) - GetOrgMembers
* [getOrgPendingInvites](docs/sdks/organizationsv1/README.md#getorgpendinginvites) - GetOrgPendingInvites
* [getOrgs](docs/sdks/organizationsv1/README.md#getorgs) - GetOrgs
* [getUsageLimits](docs/sdks/organizationsv1/README.md#getusagelimits) - GetUsageLimits
* [getUserPendingInvites](docs/sdks/organizationsv1/README.md#getuserpendinginvites) - GetUserPendingInvites
* [inviteUser](docs/sdks/organizationsv1/README.md#inviteuser) - InviteUser
* [rejectInvite](docs/sdks/organizationsv1/README.md#rejectinvite) - RejectInvite
* [rescindInvite](docs/sdks/organizationsv1/README.md#rescindinvite) - RescindInvite
* [updateUserInvite](docs/sdks/organizationsv1/README.md#updateuserinvite) - UpdateUserInvite

### [~~processesV1()~~](docs/sdks/processesv1/README.md)

* [~~getProcessInfoDeprecated~~](docs/sdks/processesv1/README.md#getprocessinfodeprecated) - GetProcessInfoDeprecated :warning: **Deprecated**
* [~~getRunningProcesses~~](docs/sdks/processesv1/README.md#getrunningprocesses) - GetRunningProcesses :warning: **Deprecated**
* [~~getStoppedProcesses~~](docs/sdks/processesv1/README.md#getstoppedprocesses) - GetStoppedProcesses :warning: **Deprecated**

### [~~processesV2()~~](docs/sdks/processesv2/README.md)

* [~~createProcessV2Deprecated~~](docs/sdks/processesv2/README.md#createprocessv2deprecated) - CreateProcessV2Deprecated :warning: **Deprecated**
* [~~getLatestProcessesV2Deprecated~~](docs/sdks/processesv2/README.md#getlatestprocessesv2deprecated) - GetLatestProcessesV2Deprecated :warning: **Deprecated**
* [~~getProcessInfoV2Deprecated~~](docs/sdks/processesv2/README.md#getprocessinfov2deprecated) - GetProcessInfoV2Deprecated :warning: **Deprecated**
* [~~getProcessesCountExperimentalV2Deprecated~~](docs/sdks/processesv2/README.md#getprocessescountexperimentalv2deprecated) - GetProcessesCountExperimentalV2Deprecated :warning: **Deprecated**
* [~~stopProcessV2Deprecated~~](docs/sdks/processesv2/README.md#stopprocessv2deprecated) - StopProcessV2Deprecated :warning: **Deprecated**

### [processesV3()](docs/sdks/processesv3/README.md)

* [createProcess](docs/sdks/processesv3/README.md#createprocess) - CreateProcess
* [getLatestProcesses](docs/sdks/processesv3/README.md#getlatestprocesses) - GetLatestProcesses
* [getProcess](docs/sdks/processesv3/README.md#getprocess) - GetProcess
* [getProcessMetrics](docs/sdks/processesv3/README.md#getprocessmetrics) - GetProcessMetrics
* [getProcessesCountExperimental](docs/sdks/processesv3/README.md#getprocessescountexperimental) - GetProcessesCountExperimental
* [stopProcess](docs/sdks/processesv3/README.md#stopprocess) - StopProcess

### [~~roomsV1()~~](docs/sdks/roomsv1/README.md)

* [~~createRoomDeprecated~~](docs/sdks/roomsv1/README.md#createroomdeprecated) - CreateRoomDeprecated :warning: **Deprecated**
* [~~destroyRoomDeprecated~~](docs/sdks/roomsv1/README.md#destroyroomdeprecated) - DestroyRoomDeprecated :warning: **Deprecated**
* [~~getActiveRoomsForProcessDeprecated~~](docs/sdks/roomsv1/README.md#getactiveroomsforprocessdeprecated) - GetActiveRoomsForProcessDeprecated :warning: **Deprecated**
* [~~getConnectionInfoDeprecated~~](docs/sdks/roomsv1/README.md#getconnectioninfodeprecated) - GetConnectionInfoDeprecated :warning: **Deprecated**
* [~~getInactiveRoomsForProcessDeprecated~~](docs/sdks/roomsv1/README.md#getinactiveroomsforprocessdeprecated) - GetInactiveRoomsForProcessDeprecated :warning: **Deprecated**
* [~~getRoomInfoDeprecated~~](docs/sdks/roomsv1/README.md#getroominfodeprecated) - GetRoomInfoDeprecated :warning: **Deprecated**
* [~~suspendRoomDeprecated~~](docs/sdks/roomsv1/README.md#suspendroomdeprecated) - SuspendRoomDeprecated :warning: **Deprecated**

### [roomsV2()](docs/sdks/roomsv2/README.md)

* [createRoom](docs/sdks/roomsv2/README.md#createroom) - CreateRoom
* [destroyRoom](docs/sdks/roomsv2/README.md#destroyroom) - DestroyRoom
* [getActiveRoomsForProcess](docs/sdks/roomsv2/README.md#getactiveroomsforprocess) - GetActiveRoomsForProcess
* [getConnectionInfo](docs/sdks/roomsv2/README.md#getconnectioninfo) - GetConnectionInfo
* [getInactiveRoomsForProcess](docs/sdks/roomsv2/README.md#getinactiveroomsforprocess) - GetInactiveRoomsForProcess
* [getRoomInfo](docs/sdks/roomsv2/README.md#getroominfo) - GetRoomInfo
* [resumeRoom](docs/sdks/roomsv2/README.md#resumeroom) - ResumeRoom
* [~~suspendRoomV2Deprecated~~](docs/sdks/roomsv2/README.md#suspendroomv2deprecated) - SuspendRoomV2Deprecated :warning: **Deprecated**
* [updateRoomConfig](docs/sdks/roomsv2/README.md#updateroomconfig) - UpdateRoomConfig

### [tokensV1()](docs/sdks/tokensv1/README.md)

* [createOrgToken](docs/sdks/tokensv1/README.md#createorgtoken) - CreateOrgToken
* [getOrgTokens](docs/sdks/tokensv1/README.md#getorgtokens) - GetOrgTokens
* [revokeOrgToken](docs/sdks/tokensv1/README.md#revokeorgtoken) - RevokeOrgToken

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

Certain parameters are configured globally. These parameters may be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, These global values will be used as defaults on the operations that use them. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `appId` to `"app-af469a92-5b45-4565-b3c4-b79878de67d2"` at SDK initialization and then you do not have to pass the same value on calls to operations like `createApp`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameters are available.

| Name  | Type             | Description          |
| ----- | ---------------- | -------------------- |
| appId | java.lang.String | The appId parameter. |
| orgId | java.lang.String | The orgId parameter. |

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

    public static void main(String[] args) throws ApiError, ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
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
<!-- End Global Parameters [global-parameters] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/SDKError` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `createApp` method throws the following exceptions:

| Error Type             | Status Code        | Content Type     |
| ---------------------- | ------------------ | ---------------- |
| models/errors/ApiError | 401, 404, 422, 429 | application/json |
| models/errors/ApiError | 500                | application/json |
| models/errors/SDKError | 4XX, 5XX           | \*/\*            |

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

    public static void main(String[] args) throws ApiError, ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
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

You can override the default server globally using the `.serverIndex(int serverIdx)` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| #   | Server                    | Description |
| --- | ------------------------- | ----------- |
| 0   | `https://api.hathora.dev` |             |
| 1   | `/`                       |             |

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

    public static void main(String[] args) throws ApiError, ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .serverIndex(1)
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
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

The default server can also be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
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

    public static void main(String[] args) throws ApiError, ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .serverURL("https://api.hathora.dev")
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
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

| Name              | Type | Scheme      |
| ----------------- | ---- | ----------- |
| `hathoraDevToken` | http | HTTP Bearer |

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

    public static void main(String[] args) throws ApiError, ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
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

    public static void main(String[] args) throws ApiError, ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        CreateLobbyRequest req = CreateLobbyRequest.builder()
                .createLobbyV3Params(CreateLobbyV3Params.builder()
                    .region(Region.SEATTLE)
                    .visibility(LobbyVisibility.PRIVATE)
                    .roomConfig("{\"name\":\"my-room\"}")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
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
