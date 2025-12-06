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
  * [Asynchronous Support](#asynchronous-support)
  * [Authentication](#authentication)
  * [Custom HTTP Client](#custom-http-client)
  * [Debugging](#debugging)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'dev.hathora:cloud-sdk:3.4.0'
```

Maven:
```xml
<dependency>
    <groupId>dev.hathora</groupId>
    <artifactId>cloud-sdk</artifactId>
    <version>3.4.0</version>
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
import dev.hathora.cloud_sdk.models.shared.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        CreateAppResponse res = sdk.appsV2().createApp()
                .createAppConfig(CreateAppConfig.builder()
                    .appName("minecraft")
                    .authConfiguration(AuthConfiguration.builder()
                        .build())
                    .build())
                .call();

        if (res.application().isPresent()) {
            // handle response
        }
    }
}
```
#### Asynchronous Call
An asynchronous SDK client is also available that returns a [`CompletableFuture<T>`][comp-fut]. See [Asynchronous Support](#asynchronous-support) for more details on async benefits and reactive library integration.
```java
package hello.world;

import dev.hathora.cloud_sdk.AsyncHathoraCloud;
import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.operations.async.CreateAppResponse;
import dev.hathora.cloud_sdk.models.shared.*;
import java.util.concurrent.CompletableFuture;

public class Application {

    public static void main(String[] args) {

        AsyncHathoraCloud sdk = HathoraCloud.builder()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build()
            .async();

        CompletableFuture<CreateAppResponse> resFut = sdk.appsV2().createApp()
                .createAppConfig(CreateAppConfig.builder()
                    .appName("minecraft")
                    .authConfiguration(AuthConfiguration.builder()
                        .build())
                    .build())
                .call();

        resFut.thenAccept(res -> {
            if (res.application().isPresent()) {
            // handle response
            }
        });
    }
}
```

[comp-fut]: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [~~AppsV1~~](docs/sdks/appsv1/README.md)

* [~~createAppV1Deprecated~~](docs/sdks/appsv1/README.md#createappv1deprecated) - CreateAppV1Deprecated :warning: **Deprecated**
* [~~deleteAppV1Deprecated~~](docs/sdks/appsv1/README.md#deleteappv1deprecated) - DeleteAppV1Deprecated :warning: **Deprecated**
* [~~getAppInfoV1Deprecated~~](docs/sdks/appsv1/README.md#getappinfov1deprecated) - GetAppInfoV1Deprecated :warning: **Deprecated**
* [~~getAppsV1Deprecated~~](docs/sdks/appsv1/README.md#getappsv1deprecated) - GetAppsV1Deprecated :warning: **Deprecated**
* [~~updateAppV1Deprecated~~](docs/sdks/appsv1/README.md#updateappv1deprecated) - UpdateAppV1Deprecated :warning: **Deprecated**

### [AppsV2](docs/sdks/appsv2/README.md)

* [createApp](docs/sdks/appsv2/README.md#createapp) - CreateApp
* [deleteApp](docs/sdks/appsv2/README.md#deleteapp) - DeleteApp
* [getApp](docs/sdks/appsv2/README.md#getapp) - GetApp
* [getApps](docs/sdks/appsv2/README.md#getapps) - GetApps
* [patchApp](docs/sdks/appsv2/README.md#patchapp) - PatchApp
* [updateApp](docs/sdks/appsv2/README.md#updateapp) - UpdateApp

### [AuthV1](docs/sdks/authv1/README.md)

* [loginAnonymous](docs/sdks/authv1/README.md#loginanonymous) - LoginAnonymous
* [loginGoogle](docs/sdks/authv1/README.md#logingoogle) - LoginGoogle
* [loginNickname](docs/sdks/authv1/README.md#loginnickname) - LoginNickname

### [BillingV1](docs/sdks/billingv1/README.md)

* [~~getBalance~~](docs/sdks/billingv1/README.md#getbalance) - GetBalance :warning: **Deprecated**
* [getInvoices](docs/sdks/billingv1/README.md#getinvoices) - GetInvoices
* [getPaymentMethod](docs/sdks/billingv1/README.md#getpaymentmethod) - GetPaymentMethod
* [getUpcomingInvoiceItems](docs/sdks/billingv1/README.md#getupcominginvoiceitems) - GetUpcomingInvoiceItems
* [getUpcomingInvoiceTotal](docs/sdks/billingv1/README.md#getupcominginvoicetotal) - GetUpcomingInvoiceTotal
* [initStripeCustomerPortalUrl](docs/sdks/billingv1/README.md#initstripecustomerportalurl) - InitStripeCustomerPortalUrl

### [~~BuildsV1~~](docs/sdks/buildsv1/README.md)

* [~~createBuildDeprecated~~](docs/sdks/buildsv1/README.md#createbuilddeprecated) - CreateBuildDeprecated :warning: **Deprecated**
* [~~deleteBuildDeprecated~~](docs/sdks/buildsv1/README.md#deletebuilddeprecated) - DeleteBuildDeprecated :warning: **Deprecated**
* [~~getBuildInfoDeprecated~~](docs/sdks/buildsv1/README.md#getbuildinfodeprecated) - GetBuildInfoDeprecated :warning: **Deprecated**
* [~~getBuildsDeprecated~~](docs/sdks/buildsv1/README.md#getbuildsdeprecated) - GetBuildsDeprecated :warning: **Deprecated**
* [~~runBuildDeprecated~~](docs/sdks/buildsv1/README.md#runbuilddeprecated) - RunBuildDeprecated :warning: **Deprecated**

### [~~BuildsV2~~](docs/sdks/buildsv2/README.md)

* [~~createBuildV2Deprecated~~](docs/sdks/buildsv2/README.md#createbuildv2deprecated) - CreateBuildV2Deprecated :warning: **Deprecated**
* [~~createBuildWithUploadUrlV2Deprecated~~](docs/sdks/buildsv2/README.md#createbuildwithuploadurlv2deprecated) - CreateBuildWithUploadUrlV2Deprecated :warning: **Deprecated**
* [~~createWithMultipartUploadsV2Deprecated~~](docs/sdks/buildsv2/README.md#createwithmultipartuploadsv2deprecated) - CreateWithMultipartUploadsV2Deprecated :warning: **Deprecated**
* [~~deleteBuildV2Deprecated~~](docs/sdks/buildsv2/README.md#deletebuildv2deprecated) - DeleteBuildV2Deprecated :warning: **Deprecated**
* [~~getBuildInfoV2Deprecated~~](docs/sdks/buildsv2/README.md#getbuildinfov2deprecated) - GetBuildInfoV2Deprecated :warning: **Deprecated**
* [~~getBuildsV2Deprecated~~](docs/sdks/buildsv2/README.md#getbuildsv2deprecated) - GetBuildsV2Deprecated :warning: **Deprecated**
* [~~runBuildV2Deprecated~~](docs/sdks/buildsv2/README.md#runbuildv2deprecated) - RunBuildV2Deprecated :warning: **Deprecated**

### [BuildsV3](docs/sdks/buildsv3/README.md)

* [createBuild](docs/sdks/buildsv3/README.md#createbuild) - CreateBuild
* [createBuildRegistry](docs/sdks/buildsv3/README.md#createbuildregistry) - CreateBuildRegistry
* [deleteBuild](docs/sdks/buildsv3/README.md#deletebuild) - DeleteBuild
* [getBuild](docs/sdks/buildsv3/README.md#getbuild) - GetBuild
* [getBuilds](docs/sdks/buildsv3/README.md#getbuilds) - GetBuilds
* [runBuild](docs/sdks/buildsv3/README.md#runbuild) - RunBuild
* [runBuildRegistry](docs/sdks/buildsv3/README.md#runbuildregistry) - RunBuildRegistry

### [~~DeploymentsV1~~](docs/sdks/deploymentsv1/README.md)

* [~~createDeploymentV1Deprecated~~](docs/sdks/deploymentsv1/README.md#createdeploymentv1deprecated) - CreateDeploymentV1Deprecated :warning: **Deprecated**
* [~~getDeploymentInfoV1Deprecated~~](docs/sdks/deploymentsv1/README.md#getdeploymentinfov1deprecated) - GetDeploymentInfoV1Deprecated :warning: **Deprecated**
* [~~getDeploymentsV1Deprecated~~](docs/sdks/deploymentsv1/README.md#getdeploymentsv1deprecated) - GetDeploymentsV1Deprecated :warning: **Deprecated**
* [~~getLatestDeploymentV1Deprecated~~](docs/sdks/deploymentsv1/README.md#getlatestdeploymentv1deprecated) - GetLatestDeploymentV1Deprecated :warning: **Deprecated**

### [~~DeploymentsV2~~](docs/sdks/deploymentsv2/README.md)

* [~~createDeploymentV2Deprecated~~](docs/sdks/deploymentsv2/README.md#createdeploymentv2deprecated) - CreateDeploymentV2Deprecated :warning: **Deprecated**
* [~~getDeploymentInfoV2Deprecated~~](docs/sdks/deploymentsv2/README.md#getdeploymentinfov2deprecated) - GetDeploymentInfoV2Deprecated :warning: **Deprecated**
* [~~getDeploymentsV2Deprecated~~](docs/sdks/deploymentsv2/README.md#getdeploymentsv2deprecated) - GetDeploymentsV2Deprecated :warning: **Deprecated**
* [~~getLatestDeploymentV2Deprecated~~](docs/sdks/deploymentsv2/README.md#getlatestdeploymentv2deprecated) - GetLatestDeploymentV2Deprecated :warning: **Deprecated**

### [DeploymentsV3](docs/sdks/deploymentsv3/README.md)

* [createDeployment](docs/sdks/deploymentsv3/README.md#createdeployment) - CreateDeployment
* [getDeployment](docs/sdks/deploymentsv3/README.md#getdeployment) - GetDeployment
* [getDeployments](docs/sdks/deploymentsv3/README.md#getdeployments) - GetDeployments
* [getLatestDeployment](docs/sdks/deploymentsv3/README.md#getlatestdeployment) - GetLatestDeployment

### [~~DiscoveryV1~~](docs/sdks/discoveryv1/README.md)

* [~~getPingServiceEndpointsDeprecated~~](docs/sdks/discoveryv1/README.md#getpingserviceendpointsdeprecated) - GetPingServiceEndpointsDeprecated :warning: **Deprecated**

### [DiscoveryV2](docs/sdks/discoveryv2/README.md)

* [getPingServiceEndpoints](docs/sdks/discoveryv2/README.md#getpingserviceendpoints) - GetPingServiceEndpoints

### [FleetsV1](docs/sdks/fleetsv1/README.md)

* [createFleetDeprecated](docs/sdks/fleetsv1/README.md#createfleetdeprecated) - CreateFleetDeprecated
* [getFleetDeprecated](docs/sdks/fleetsv1/README.md#getfleetdeprecated) - GetFleetDeprecated
* [getFleetMetricsDeprecated](docs/sdks/fleetsv1/README.md#getfleetmetricsdeprecated) - GetFleetMetricsDeprecated
* [getFleetRegionDeprecated](docs/sdks/fleetsv1/README.md#getfleetregiondeprecated) - GetFleetRegionDeprecated
* [getFleetRegionMetricsDeprecated](docs/sdks/fleetsv1/README.md#getfleetregionmetricsdeprecated) - GetFleetRegionMetricsDeprecated
* [getFleetsDeprecated](docs/sdks/fleetsv1/README.md#getfleetsdeprecated) - GetFleetsDeprecated
* [updateFleetDeprecated](docs/sdks/fleetsv1/README.md#updatefleetdeprecated) - UpdateFleetDeprecated
* [updateFleetRegionDeprecated](docs/sdks/fleetsv1/README.md#updatefleetregiondeprecated) - UpdateFleetRegionDeprecated

### [FleetsV2](docs/sdks/fleetsv2/README.md)

* [createFleet](docs/sdks/fleetsv2/README.md#createfleet) - CreateFleet
* [~~deprecatedUpdateFleetRegionV2~~](docs/sdks/fleetsv2/README.md#deprecatedupdatefleetregionv2) - DeprecatedUpdateFleetRegionV2 :warning: **Deprecated**
* [getFleet](docs/sdks/fleetsv2/README.md#getfleet) - GetFleet
* [getFleetMetrics](docs/sdks/fleetsv2/README.md#getfleetmetrics) - GetFleetMetrics
* [getFleetRegion](docs/sdks/fleetsv2/README.md#getfleetregion) - GetFleetRegion
* [getFleetRegionMetrics](docs/sdks/fleetsv2/README.md#getfleetregionmetrics) - GetFleetRegionMetrics
* [getFleets](docs/sdks/fleetsv2/README.md#getfleets) - GetFleets
* [getNodeShapes](docs/sdks/fleetsv2/README.md#getnodeshapes) - GetNodeShapes
* [updateFleet](docs/sdks/fleetsv2/README.md#updatefleet) - UpdateFleet
* [updateFleetRegion](docs/sdks/fleetsv2/README.md#updatefleetregion) - UpdateFleetRegion

### [~~LobbiesV1~~](docs/sdks/lobbiesv1/README.md)

* [~~createPrivateLobbyDeprecated~~](docs/sdks/lobbiesv1/README.md#createprivatelobbydeprecated) - CreatePrivateLobbyDeprecated :warning: **Deprecated**
* [~~createPublicLobbyDeprecated~~](docs/sdks/lobbiesv1/README.md#createpubliclobbydeprecated) - CreatePublicLobbyDeprecated :warning: **Deprecated**
* [~~listActivePublicLobbiesDeprecatedV1~~](docs/sdks/lobbiesv1/README.md#listactivepubliclobbiesdeprecatedv1) - ListActivePublicLobbiesDeprecatedV1 :warning: **Deprecated**

### [~~LobbiesV2~~](docs/sdks/lobbiesv2/README.md)

* [~~createLobbyDeprecated~~](docs/sdks/lobbiesv2/README.md#createlobbydeprecated) - CreateLobbyDeprecated :warning: **Deprecated**
* [~~createLocalLobby~~](docs/sdks/lobbiesv2/README.md#createlocallobby) - CreateLocalLobby :warning: **Deprecated**
* [~~createPrivateLobby~~](docs/sdks/lobbiesv2/README.md#createprivatelobby) - CreatePrivateLobby :warning: **Deprecated**
* [~~createPublicLobby~~](docs/sdks/lobbiesv2/README.md#createpubliclobby) - CreatePublicLobby :warning: **Deprecated**
* [~~getLobbyInfo~~](docs/sdks/lobbiesv2/README.md#getlobbyinfo) - GetLobbyInfo :warning: **Deprecated**
* [~~listActivePublicLobbiesDeprecatedV2~~](docs/sdks/lobbiesv2/README.md#listactivepubliclobbiesdeprecatedv2) - ListActivePublicLobbiesDeprecatedV2 :warning: **Deprecated**
* [~~setLobbyState~~](docs/sdks/lobbiesv2/README.md#setlobbystate) - SetLobbyState :warning: **Deprecated**

### [LobbiesV3](docs/sdks/lobbiesv3/README.md)

* [createLobby](docs/sdks/lobbiesv3/README.md#createlobby) - CreateLobby
* [getLobbyInfoByRoomId](docs/sdks/lobbiesv3/README.md#getlobbyinfobyroomid) - GetLobbyInfoByRoomId
* [getLobbyInfoByShortCode](docs/sdks/lobbiesv3/README.md#getlobbyinfobyshortcode) - GetLobbyInfoByShortCode
* [listActivePublicLobbies](docs/sdks/lobbiesv3/README.md#listactivepubliclobbies) - ListActivePublicLobbies

### [LogsV1](docs/sdks/logsv1/README.md)

* [downloadLogForProcess](docs/sdks/logsv1/README.md#downloadlogforprocess) - DownloadLogForProcess
* [getLogsForProcess](docs/sdks/logsv1/README.md#getlogsforprocess) - GetLogsForProcess

### [ManagementV1](docs/sdks/managementv1/README.md)

* [sendVerificationEmail](docs/sdks/managementv1/README.md#sendverificationemail) - SendVerificationEmail

### [~~MetricsV1~~](docs/sdks/metricsv1/README.md)

* [~~getMetricsDeprecated~~](docs/sdks/metricsv1/README.md#getmetricsdeprecated) - GetMetricsDeprecated :warning: **Deprecated**

### [NodesV1](docs/sdks/nodesv1/README.md)

* [getNode](docs/sdks/nodesv1/README.md#getnode) - GetNode
* [listProvisionedNodes](docs/sdks/nodesv1/README.md#listprovisionednodes) - ListProvisionedNodes

### [OrganizationsV1](docs/sdks/organizationsv1/README.md)

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

### [~~ProcessesV1~~](docs/sdks/processesv1/README.md)

* [~~getProcessInfoDeprecated~~](docs/sdks/processesv1/README.md#getprocessinfodeprecated) - GetProcessInfoDeprecated :warning: **Deprecated**
* [~~getRunningProcesses~~](docs/sdks/processesv1/README.md#getrunningprocesses) - GetRunningProcesses :warning: **Deprecated**
* [~~getStoppedProcesses~~](docs/sdks/processesv1/README.md#getstoppedprocesses) - GetStoppedProcesses :warning: **Deprecated**

### [~~ProcessesV2~~](docs/sdks/processesv2/README.md)

* [~~createProcessV2Deprecated~~](docs/sdks/processesv2/README.md#createprocessv2deprecated) - CreateProcessV2Deprecated :warning: **Deprecated**
* [~~getLatestProcessesV2Deprecated~~](docs/sdks/processesv2/README.md#getlatestprocessesv2deprecated) - GetLatestProcessesV2Deprecated :warning: **Deprecated**
* [~~getProcessInfoV2Deprecated~~](docs/sdks/processesv2/README.md#getprocessinfov2deprecated) - GetProcessInfoV2Deprecated :warning: **Deprecated**
* [~~getProcessesCountExperimentalV2Deprecated~~](docs/sdks/processesv2/README.md#getprocessescountexperimentalv2deprecated) - GetProcessesCountExperimentalV2Deprecated :warning: **Deprecated**
* [~~stopProcessV2Deprecated~~](docs/sdks/processesv2/README.md#stopprocessv2deprecated) - StopProcessV2Deprecated :warning: **Deprecated**

### [ProcessesV3](docs/sdks/processesv3/README.md)

* [createProcess](docs/sdks/processesv3/README.md#createprocess) - CreateProcess
* [getLatestProcesses](docs/sdks/processesv3/README.md#getlatestprocesses) - GetLatestProcesses
* [getProcess](docs/sdks/processesv3/README.md#getprocess) - GetProcess
* [getProcessMetrics](docs/sdks/processesv3/README.md#getprocessmetrics) - GetProcessMetrics
* [getProcessesCountExperimental](docs/sdks/processesv3/README.md#getprocessescountexperimental) - GetProcessesCountExperimental
* [stopProcess](docs/sdks/processesv3/README.md#stopprocess) - StopProcess

### [~~RoomsV1~~](docs/sdks/roomsv1/README.md)

* [~~createRoomDeprecated~~](docs/sdks/roomsv1/README.md#createroomdeprecated) - CreateRoomDeprecated :warning: **Deprecated**
* [~~destroyRoomDeprecated~~](docs/sdks/roomsv1/README.md#destroyroomdeprecated) - DestroyRoomDeprecated :warning: **Deprecated**
* [~~getActiveRoomsForProcessDeprecated~~](docs/sdks/roomsv1/README.md#getactiveroomsforprocessdeprecated) - GetActiveRoomsForProcessDeprecated :warning: **Deprecated**
* [~~getConnectionInfoDeprecated~~](docs/sdks/roomsv1/README.md#getconnectioninfodeprecated) - GetConnectionInfoDeprecated :warning: **Deprecated**
* [~~getInactiveRoomsForProcessDeprecated~~](docs/sdks/roomsv1/README.md#getinactiveroomsforprocessdeprecated) - GetInactiveRoomsForProcessDeprecated :warning: **Deprecated**
* [~~getRoomInfoDeprecated~~](docs/sdks/roomsv1/README.md#getroominfodeprecated) - GetRoomInfoDeprecated :warning: **Deprecated**
* [~~suspendRoomDeprecated~~](docs/sdks/roomsv1/README.md#suspendroomdeprecated) - SuspendRoomDeprecated :warning: **Deprecated**

### [RoomsV2](docs/sdks/roomsv2/README.md)

* [createRoom](docs/sdks/roomsv2/README.md#createroom) - CreateRoom
* [destroyRoom](docs/sdks/roomsv2/README.md#destroyroom) - DestroyRoom
* [getActiveRoomsForProcess](docs/sdks/roomsv2/README.md#getactiveroomsforprocess) - GetActiveRoomsForProcess
* [getConnectionInfo](docs/sdks/roomsv2/README.md#getconnectioninfo) - GetConnectionInfo
* [getInactiveRoomsForProcess](docs/sdks/roomsv2/README.md#getinactiveroomsforprocess) - GetInactiveRoomsForProcess
* [getRoomInfo](docs/sdks/roomsv2/README.md#getroominfo) - GetRoomInfo
* [resumeRoom](docs/sdks/roomsv2/README.md#resumeroom) - ResumeRoom
* [~~suspendRoomV2Deprecated~~](docs/sdks/roomsv2/README.md#suspendroomv2deprecated) - SuspendRoomV2Deprecated :warning: **Deprecated**
* [updateRoomConfig](docs/sdks/roomsv2/README.md#updateroomconfig) - UpdateRoomConfig

### [TokensV1](docs/sdks/tokensv1/README.md)

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
import dev.hathora.cloud_sdk.models.shared.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        CreateAppResponse res = sdk.appsV2().createApp()
                .createAppConfig(CreateAppConfig.builder()
                    .appName("minecraft")
                    .authConfiguration(AuthConfiguration.builder()
                        .build())
                    .build())
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


[`HathoraCloudException`](./src/main/java/models/errors/HathoraCloudException.java) is the base class for all HTTP error responses. It has the following properties:

| Method           | Type                        | Description                                                              |
| ---------------- | --------------------------- | ------------------------------------------------------------------------ |
| `message()`      | `String`                    | Error message                                                            |
| `code()`         | `int`                       | HTTP response status code eg `404`                                       |
| `headers`        | `Map<String, List<String>>` | HTTP response headers                                                    |
| `body()`         | `byte[]`                    | HTTP body as a byte array. Can be empty array if no body is returned.    |
| `bodyAsString()` | `String`                    | HTTP body as a UTF-8 string. Can be empty string if no body is returned. |
| `rawResponse()`  | `HttpResponse<?>`           | Raw HTTP response (body already read and not available for re-read)      |

### Example
```java
package hello.world;

import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.errors.HathoraCloudException;
import dev.hathora.cloud_sdk.models.operations.CreateAppResponse;
import dev.hathora.cloud_sdk.models.shared.*;
import java.io.UncheckedIOException;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();
        try {

            CreateAppResponse res = sdk.appsV2().createApp()
                    .createAppConfig(CreateAppConfig.builder()
                        .appName("minecraft")
                        .authConfiguration(AuthConfiguration.builder()
                            .build())
                        .build())
                    .call();

            if (res.application().isPresent()) {
                // handle response
            }
        } catch (HathoraCloudException ex) { // all SDK exceptions inherit from HathoraCloudException

            // ex.ToString() provides a detailed error message including
            // HTTP status code, headers, and error payload (if any)
            System.out.println(ex);

            // Base exception fields
            var rawResponse = ex.rawResponse();
            var headers = ex.headers();
            var contentType = headers.first("Content-Type");
            int statusCode = ex.code();
            Optional<byte[]> responseBody = ex.body();

            // different error subclasses may be thrown 
            // depending on the service call
            if (ex instanceof ApiError) {
                var e = (ApiError) ex;
                // Check error data fields
                e.data().ifPresent(payload -> {
                      String message = payload.message();
                });
            }

            // An underlying cause may be provided. If the error payload 
            // cannot be deserialized then the deserialization exception 
            // will be set as the cause.
            if (ex.getCause() != null) {
                var cause = ex.getCause();
            }
        } catch (UncheckedIOException ex) {
            // handle IO error (connection, timeout, etc)
        }    }
}
```

### Error Classes
**Primary errors:**
* [`HathoraCloudException`](./src/main/java/models/errors/HathoraCloudException.java): The base class for HTTP error responses.
  * [`dev.hathora.cloud_sdk.models.errors.ApiError`](./src/main/java/models/errors/dev.hathora.cloud_sdk.models.errors.ApiError.java): . *

<details><summary>Less common errors (6)</summary>

<br />

**Network errors:**
* `java.io.IOException` (always wrapped by `java.io.UncheckedIOException`). Commonly encountered subclasses of
`IOException` include `java.net.ConnectException`, `java.net.SocketTimeoutException`, `EOFException` (there are
many more subclasses in the JDK platform).

**Inherit from [`HathoraCloudException`](./src/main/java/models/errors/HathoraCloudException.java)**:


</details>

\* Check [the method documentation](#available-resources-and-operations) to see if the error is applicable.
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
import dev.hathora.cloud_sdk.models.shared.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .serverIndex(0)
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        CreateAppResponse res = sdk.appsV2().createApp()
                .createAppConfig(CreateAppConfig.builder()
                    .appName("minecraft")
                    .authConfiguration(AuthConfiguration.builder()
                        .build())
                    .build())
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
import dev.hathora.cloud_sdk.models.shared.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .serverURL("https://api.hathora.dev")
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
            .build();

        CreateAppResponse res = sdk.appsV2().createApp()
                .createAppConfig(CreateAppConfig.builder()
                    .appName("minecraft")
                    .authConfiguration(AuthConfiguration.builder()
                        .build())
                    .build())
                .call();

        if (res.application().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Asynchronous Support [async-support] -->
## Asynchronous Support

The SDK provides comprehensive asynchronous support using Java's [`CompletableFuture<T>`][comp-fut] and [Reactive Streams `Publisher<T>`][reactive-streams] APIs. This design makes no assumptions about your choice of reactive toolkit, allowing seamless integration with any reactive library.

<details>
<summary>Why Use Async?</summary>

Asynchronous operations provide several key benefits:

- **Non-blocking I/O**: Your threads stay free for other work while operations are in flight
- **Better resource utilization**: Handle more concurrent operations with fewer threads
- **Improved scalability**: Build highly responsive applications that can handle thousands of concurrent requests
- **Reactive integration**: Works seamlessly with reactive streams and backpressure handling

</details>

<details>
<summary>Reactive Library Integration</summary>

The SDK returns [Reactive Streams `Publisher<T>`][reactive-streams] instances for operations dealing with streams involving multiple I/O interactions. We use Reactive Streams instead of JDK Flow API to provide broader compatibility with the reactive ecosystem, as most reactive libraries natively support Reactive Streams.

**Why Reactive Streams over JDK Flow?**
- **Broader ecosystem compatibility**: Most reactive libraries (Project Reactor, RxJava, Akka Streams, etc.) natively support Reactive Streams
- **Industry standard**: Reactive Streams is the de facto standard for reactive programming in Java
- **Better interoperability**: Seamless integration without additional adapters for most use cases

**Integration with Popular Libraries:**
- **Project Reactor**: Use `Flux.from(publisher)` to convert to Reactor types
- **RxJava**: Use `Flowable.fromPublisher(publisher)` for RxJava integration
- **Akka Streams**: Use `Source.fromPublisher(publisher)` for Akka Streams integration
- **Vert.x**: Use `ReadStream.fromPublisher(vertx, publisher)` for Vert.x reactive streams
- **Mutiny**: Use `Multi.createFrom().publisher(publisher)` for Quarkus Mutiny integration

**For JDK Flow API Integration:**
If you need JDK Flow API compatibility (e.g., for Quarkus/Mutiny 2), you can use adapters:
```java
// Convert Reactive Streams Publisher to Flow Publisher
Flow.Publisher<T> flowPublisher = FlowAdapters.toFlowPublisher(reactiveStreamsPublisher);

// Convert Flow Publisher to Reactive Streams Publisher
Publisher<T> reactiveStreamsPublisher = FlowAdapters.toPublisher(flowPublisher);
```

For standard single-response operations, the SDK returns `CompletableFuture<T>` for straightforward async execution.

</details>

<details>
<summary>Supported Operations</summary>

Async support is available for:

- **[Server-sent Events](#server-sent-event-streaming)**: Stream real-time events with Reactive Streams `Publisher<T>`
- **[JSONL Streaming](#jsonl-streaming)**: Process streaming JSON lines asynchronously
- **[Pagination](#pagination)**: Iterate through paginated results using `callAsPublisher()` and `callAsPublisherUnwrapped()`
- **[File Uploads](#file-uploads)**: Upload files asynchronously with progress tracking
- **[File Downloads](#file-downloads)**: Download files asynchronously with streaming support
- **[Standard Operations](#example)**: All regular API calls return `CompletableFuture<T>` for async execution

</details>

[comp-fut]: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html
[reactive-streams]: https://www.reactive-streams.org/
<!-- End Asynchronous Support [async-support] -->

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
import dev.hathora.cloud_sdk.models.shared.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken(System.getenv().getOrDefault("HATHORA_DEV_TOKEN", ""))
                    .build())
                .orgId("org-6f706e83-0ec1-437a-9a46-7d4281eb2f39")
            .build();

        CreateAppResponse res = sdk.appsV2().createApp()
                .createAppConfig(CreateAppConfig.builder()
                    .appName("minecraft")
                    .authConfiguration(AuthConfiguration.builder()
                        .build())
                    .build())
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
import dev.hathora.cloud_sdk.models.operations.*;
import dev.hathora.cloud_sdk.models.shared.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiError, Exception {

        HathoraCloud sdk = HathoraCloud.builder()
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
            .build();

        CreateLobbyRequest req = CreateLobbyRequest.builder()
                .createLobbyV3Params(CreateLobbyV3Params.builder()
                    .region(Region.DUBAI)
                    .visibility(LobbyVisibility.PRIVATE)
                    .roomConfig("{\"name\":\"my-room\"}")
                    .build())
                .roomId("2swovpy1fnunu")
                .shortCode("LFG4")
                .build();

        CreateLobbyResponse res = sdk.lobbiesV3().createLobby()
                .request(req)
                .security(CreateLobbySecurity.builder()
                    .playerAuth(System.getenv().getOrDefault("PLAYER_AUTH", ""))
                    .build())
                .call();

        if (res.lobbyV3().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Authentication [security] -->

<!-- Start Custom HTTP Client [http-client] -->
## Custom HTTP Client

The Java SDK makes API calls using an `HTTPClient` that wraps the native
[HttpClient](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html). This
client provides the ability to attach hooks around the request lifecycle that can be used to modify the request or handle
errors and response.

The `HTTPClient` interface allows you to either use the default `SpeakeasyHTTPClient` that comes with the SDK,
or provide your own custom implementation with customized configuration such as custom executors, SSL context,
connection pools, and other HTTP client settings.

The interface provides synchronous (`send`) methods and asynchronous (`sendAsync`) methods. The `sendAsync` method
is used to power the async SDK methods and returns a `CompletableFuture<HttpResponse<Blob>>` for non-blocking operations.

The following example shows how to add a custom header and handle errors:

```java
import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.utils.HTTPClient;
import dev.hathora.cloud_sdk.utils.SpeakeasyHTTPClient;
import dev.hathora.cloud_sdk.utils.Utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.InputStream;
import java.time.Duration;

public class Application {
    public static void main(String[] args) {
        // Create a custom HTTP client with hooks
        HTTPClient httpClient = new HTTPClient() {
            private final HTTPClient defaultClient = new SpeakeasyHTTPClient();
            
            @Override
            public HttpResponse<InputStream> send(HttpRequest request) throws IOException, URISyntaxException, InterruptedException {
                // Add custom header and timeout using Utils.copy()
                HttpRequest modifiedRequest = Utils.copy(request)
                    .header("x-custom-header", "custom value")
                    .timeout(Duration.ofSeconds(30))
                    .build();
                    
                try {
                    HttpResponse<InputStream> response = defaultClient.send(modifiedRequest);
                    // Log successful response
                    System.out.println("Request successful: " + response.statusCode());
                    return response;
                } catch (Exception error) {
                    // Log error
                    System.err.println("Request failed: " + error.getMessage());
                    throw error;
                }
            }
        };

        HathoraCloud sdk = HathoraCloud.builder()
            .client(httpClient)
            .build();
    }
}
```

<details>
<summary>Custom HTTP Client Configuration</summary>

You can also provide a completely custom HTTP client with your own configuration:

```java
import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.utils.HTTPClient;
import dev.hathora.cloud_sdk.utils.Blob;
import dev.hathora.cloud_sdk.utils.ResponseWithBody;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.InputStream;
import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.CompletableFuture;

public class Application {
    public static void main(String[] args) {
        // Custom HTTP client with custom configuration
        HTTPClient customHttpClient = new HTTPClient() {
            private final HttpClient client = HttpClient.newBuilder()
                .executor(Executors.newFixedThreadPool(10))
                .connectTimeout(Duration.ofSeconds(30))
                // .sslContext(customSslContext) // Add custom SSL context if needed
                .build();

            @Override
            public HttpResponse<InputStream> send(HttpRequest request) throws IOException, URISyntaxException, InterruptedException {
                return client.send(request, HttpResponse.BodyHandlers.ofInputStream());
            }

            @Override
            public CompletableFuture<HttpResponse<Blob>> sendAsync(HttpRequest request) {
                // Convert response to HttpResponse<Blob> for async operations
                return client.sendAsync(request, HttpResponse.BodyHandlers.ofPublisher())
                    .thenApply(resp -> new ResponseWithBody<>(resp, Blob::from));
            }
        };

        HathoraCloud sdk = HathoraCloud.builder()
            .client(customHttpClient)
            .build();
    }
}
```

</details>

You can also enable debug logging on the default `SpeakeasyHTTPClient`:

```java
import dev.hathora.cloud_sdk.HathoraCloud;
import dev.hathora.cloud_sdk.utils.SpeakeasyHTTPClient;

public class Application {
    public static void main(String[] args) {
        SpeakeasyHTTPClient httpClient = new SpeakeasyHTTPClient();
        httpClient.enableDebugLogging(true);

        HathoraCloud sdk = HathoraCloud.builder()
            .client(httpClient)
            .build();
    }
}
```
<!-- End Custom HTTP Client [http-client] -->

<!-- Start Debugging [debug] -->
## Debugging

### Debug

You can setup your SDK to emit debug logs for SDK requests and responses.

For request and response logging (especially json bodies), call `enableHTTPDebugLogging(boolean)` on the SDK builder like so:

```java
SDK.builder()
    .enableHTTPDebugLogging(true)
    .build();
```
Example output:
```
Sending request: http://localhost:35123/bearer#global GET
Request headers: {Accept=[application/json], Authorization=[******], Client-Level-Header=[added by client], Idempotency-Key=[some-key], x-speakeasy-user-agent=[speakeasy-sdk/java 0.0.1 internal 0.1.0 org.openapis.openapi]}
Received response: (GET http://localhost:35123/bearer#global) 200
Response headers: {access-control-allow-credentials=[true], access-control-allow-origin=[*], connection=[keep-alive], content-length=[50], content-type=[application/json], date=[Wed, 09 Apr 2025 01:43:29 GMT], server=[gunicorn/19.9.0]}
Response body:
{
  "authenticated": true, 
  "token": "global"
}
```
__WARNING__: This logging should only be used for temporary debugging purposes. Leaving this option on in a production system could expose credentials/secrets in logs. <i>Authorization</i> headers are redacted by default and there is the ability to specify redacted header names via `SpeakeasyHTTPClient.setRedactedHeaders`.

__NOTE__: This is a convenience method that calls `HTTPClient.enableDebugLogging()`. The `SpeakeasyHTTPClient` honors this setting. If you are using a custom HTTP client, it is up to the custom client to honor this setting.


Another option is to set the System property `-Djdk.httpclient.HttpClient.log=all`. However, this second option does not log bodies.
<!-- End Debugging [debug] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
