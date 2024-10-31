/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.models.shared.AppConfig;
import dev.hathora.cloud_sdk.models.shared.CreateBuildParams;
import dev.hathora.cloud_sdk.models.shared.CreateLobbyParams;
import dev.hathora.cloud_sdk.models.shared.CreateMultipartBuildParams;
import dev.hathora.cloud_sdk.models.shared.CreateOrgToken;
import dev.hathora.cloud_sdk.models.shared.CreateRoomParams;
import dev.hathora.cloud_sdk.models.shared.CreateUserInvite;
import dev.hathora.cloud_sdk.models.shared.CustomerPortalUrl;
import dev.hathora.cloud_sdk.models.shared.DeploymentConfig;
import dev.hathora.cloud_sdk.models.shared.DeploymentConfigV2;
import dev.hathora.cloud_sdk.models.shared.DeploymentConfigV3;
import dev.hathora.cloud_sdk.models.shared.GoogleIdTokenObject;
import dev.hathora.cloud_sdk.models.shared.NicknameObject;
import dev.hathora.cloud_sdk.models.shared.ProcessStatus;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.models.shared.RescindUserInvite;
import dev.hathora.cloud_sdk.models.shared.SetLobbyStateParams;
import dev.hathora.cloud_sdk.models.shared.UpdateRoomConfigParams;
import dev.hathora.cloud_sdk.models.shared.VerificationEmailRequest;
import java.lang.Boolean;
import java.lang.Exception;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public class SDKMethodInterfaces {


    public interface MethodCallCreateAppV1Deprecated {
        CreateAppV1DeprecatedResponse createAppV1Deprecated(
            AppConfig request) throws Exception;
    }


    public interface MethodCallDeleteAppV1Deprecated {
        DeleteAppV1DeprecatedResponse deleteAppV1Deprecated(
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallGetAppInfoV1Deprecated {
        GetAppInfoV1DeprecatedResponse getAppInfoV1Deprecated(
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallGetAppsV1Deprecated {
        GetAppsV1DeprecatedResponse getAppsV1DeprecatedDirect() throws Exception;
    }


    public interface MethodCallUpdateAppV1Deprecated {
        UpdateAppV1DeprecatedResponse updateAppV1Deprecated(
            AppConfig appConfig,
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallCreateApp {
        CreateAppResponse createApp(
            AppConfig appConfig,
            Optional<String> orgId) throws Exception;
    }


    public interface MethodCallDeleteApp {
        DeleteAppResponse deleteApp(
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallGetApp {
        GetAppResponse getApp(
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallGetApps {
        GetAppsResponse getApps(
            Optional<String> orgId) throws Exception;
    }


    public interface MethodCallUpdateApp {
        UpdateAppResponse updateApp(
            AppConfig appConfig,
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallLoginAnonymous {
        LoginAnonymousResponse loginAnonymous(
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallLoginGoogle {
        LoginGoogleResponse loginGoogle(
            GoogleIdTokenObject googleIdTokenObject,
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallLoginNickname {
        LoginNicknameResponse loginNickname(
            NicknameObject nicknameObject,
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallGetBalance {
        GetBalanceResponse getBalanceDirect() throws Exception;
    }


    public interface MethodCallGetInvoices {
        GetInvoicesResponse getInvoicesDirect() throws Exception;
    }


    public interface MethodCallGetPaymentMethod {
        GetPaymentMethodResponse getPaymentMethodDirect() throws Exception;
    }


    public interface MethodCallGetUpcomingInvoiceItems {
        GetUpcomingInvoiceItemsResponse getUpcomingInvoiceItemsDirect() throws Exception;
    }


    public interface MethodCallGetUpcomingInvoiceTotal {
        GetUpcomingInvoiceTotalResponse getUpcomingInvoiceTotalDirect() throws Exception;
    }


    public interface MethodCallInitStripeCustomerPortalUrl {
        InitStripeCustomerPortalUrlResponse initStripeCustomerPortalUrl(
            CustomerPortalUrl request) throws Exception;
    }


    public interface MethodCallCreateBuildDeprecated {
        CreateBuildDeprecatedResponse createBuildDeprecated(
            CreateBuildParams createBuildParams,
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallDeleteBuildDeprecated {
        DeleteBuildDeprecatedResponse deleteBuildDeprecated(
            Optional<String> appId,
            int buildId) throws Exception;
    }


    public interface MethodCallGetBuildInfoDeprecated {
        GetBuildInfoDeprecatedResponse getBuildInfoDeprecated(
            Optional<String> appId,
            int buildId) throws Exception;
    }


    public interface MethodCallGetBuildsDeprecated {
        GetBuildsDeprecatedResponse getBuildsDeprecated(
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallRunBuildDeprecated {
        RunBuildDeprecatedResponse runBuildDeprecated(
            RunBuildDeprecatedRequestBody requestBody,
            Optional<String> appId,
            int buildId) throws Exception;
    }


    public interface MethodCallCreateBuildV2Deprecated {
        CreateBuildV2DeprecatedResponse createBuildV2Deprecated(
            CreateBuildParams createBuildParams,
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallCreateBuildWithUploadUrlV2Deprecated {
        CreateBuildWithUploadUrlV2DeprecatedResponse createBuildWithUploadUrlV2Deprecated(
            CreateBuildParams createBuildParams,
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallCreateWithMultipartUploadsV2Deprecated {
        CreateWithMultipartUploadsV2DeprecatedResponse createWithMultipartUploadsV2Deprecated(
            CreateMultipartBuildParams createMultipartBuildParams,
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallDeleteBuildV2Deprecated {
        DeleteBuildV2DeprecatedResponse deleteBuildV2Deprecated(
            Optional<String> appId,
            int buildId) throws Exception;
    }


    public interface MethodCallGetBuildInfoV2Deprecated {
        GetBuildInfoV2DeprecatedResponse getBuildInfoV2Deprecated(
            Optional<String> appId,
            int buildId) throws Exception;
    }


    public interface MethodCallGetBuildsV2Deprecated {
        GetBuildsV2DeprecatedResponse getBuildsV2Deprecated(
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallRunBuildV2Deprecated {
        RunBuildV2DeprecatedResponse runBuildV2Deprecated(
            RunBuildV2DeprecatedRequestBody requestBody,
            Optional<String> appId,
            int buildId) throws Exception;
    }


    public interface MethodCallCreateBuild {
        CreateBuildResponse createBuild(
            CreateMultipartBuildParams createMultipartBuildParams,
            Optional<String> orgId) throws Exception;
    }


    public interface MethodCallDeleteBuild {
        DeleteBuildResponse deleteBuild(
            String buildId,
            Optional<String> orgId) throws Exception;
    }


    public interface MethodCallGetBuild {
        GetBuildResponse getBuild(
            String buildId,
            Optional<String> orgId) throws Exception;
    }


    public interface MethodCallGetBuilds {
        GetBuildsResponse getBuilds(
            Optional<String> orgId) throws Exception;
    }


    public interface MethodCallRunBuild {
        RunBuildResponse runBuild(
            String buildId,
            Optional<String> orgId) throws Exception;
    }


    public interface MethodCallCreateDeploymentV1Deprecated {
        CreateDeploymentV1DeprecatedResponse createDeploymentV1Deprecated(
            DeploymentConfig deploymentConfig,
            Optional<String> appId,
            int buildId) throws Exception;
    }


    public interface MethodCallGetDeploymentInfoV1Deprecated {
        GetDeploymentInfoV1DeprecatedResponse getDeploymentInfoV1Deprecated(
            Optional<String> appId,
            int deploymentId) throws Exception;
    }


    public interface MethodCallGetDeploymentsV1Deprecated {
        GetDeploymentsV1DeprecatedResponse getDeploymentsV1Deprecated(
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallGetLatestDeploymentV1Deprecated {
        GetLatestDeploymentV1DeprecatedResponse getLatestDeploymentV1Deprecated(
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallCreateDeploymentV2Deprecated {
        CreateDeploymentV2DeprecatedResponse createDeploymentV2Deprecated(
            DeploymentConfigV2 deploymentConfigV2,
            Optional<String> appId,
            int buildId) throws Exception;
    }


    public interface MethodCallGetDeploymentInfoV2Deprecated {
        GetDeploymentInfoV2DeprecatedResponse getDeploymentInfoV2Deprecated(
            Optional<String> appId,
            int deploymentId) throws Exception;
    }


    public interface MethodCallGetDeploymentsV2Deprecated {
        GetDeploymentsV2DeprecatedResponse getDeploymentsV2Deprecated(
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallGetLatestDeploymentV2Deprecated {
        GetLatestDeploymentV2DeprecatedResponse getLatestDeploymentV2Deprecated(
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallCreateDeployment {
        CreateDeploymentResponse createDeployment(
            DeploymentConfigV3 deploymentConfigV3,
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallGetDeployment {
        GetDeploymentResponse getDeployment(
            Optional<String> appId,
            String deploymentId) throws Exception;
    }


    public interface MethodCallGetDeployments {
        GetDeploymentsResponse getDeployments(
            Optional<String> appId,
            Optional<String> deploymentTag) throws Exception;
    }


    public interface MethodCallGetLatestDeployment {
        GetLatestDeploymentResponse getLatestDeployment(
            Optional<String> appId) throws Exception;
    }


    public interface MethodCallGetPingServiceEndpointsDeprecated {
        GetPingServiceEndpointsDeprecatedResponse getPingServiceEndpointsDeprecatedDirect() throws Exception;
    }


    public interface MethodCallGetPingServiceEndpoints {
        GetPingServiceEndpointsResponse getPingServiceEndpointsDirect() throws Exception;
    }


    public interface MethodCallGetFleetMetrics {
        GetFleetMetricsResponse getFleetMetrics(
            GetFleetMetricsRequest request) throws Exception;
    }


    public interface MethodCallGetFleetRegion {
        GetFleetRegionResponse getFleetRegion(
            String fleetId,
            Optional<String> orgId,
            Region region) throws Exception;
    }


    public interface MethodCallGetFleets {
        GetFleetsResponse getFleets(
            Optional<String> orgId) throws Exception;
    }


    public interface MethodCallUpdateFleetRegion {
        UpdateFleetRegionResponse updateFleetRegion(
            UpdateFleetRegionRequest request) throws Exception;
    }


    public interface MethodCallCreatePrivateLobbyDeprecated {
        CreatePrivateLobbyDeprecatedResponse createPrivateLobbyDeprecated(
            CreatePrivateLobbyDeprecatedSecurity security,
            Optional<String> appId,
            Optional<Boolean> local,
            Optional<? extends Region> region) throws Exception;
    }


    public interface MethodCallCreatePublicLobbyDeprecated {
        CreatePublicLobbyDeprecatedResponse createPublicLobbyDeprecated(
            CreatePublicLobbyDeprecatedSecurity security,
            Optional<String> appId,
            Optional<Boolean> local,
            Optional<? extends Region> region) throws Exception;
    }


    public interface MethodCallListActivePublicLobbiesDeprecatedV1 {
        ListActivePublicLobbiesDeprecatedV1Response listActivePublicLobbiesDeprecatedV1(
            Optional<String> appId,
            Optional<Boolean> local,
            Optional<? extends Region> region) throws Exception;
    }


    public interface MethodCallCreateLobbyDeprecated {
        CreateLobbyDeprecatedResponse createLobbyDeprecated(
            CreateLobbyDeprecatedSecurity security,
            CreateLobbyParams createLobbyParams,
            Optional<String> appId,
            Optional<String> roomId) throws Exception;
    }


    public interface MethodCallCreateLocalLobby {
        CreateLocalLobbyResponse createLocalLobby(
            CreateLocalLobbySecurity security,
            CreateLocalLobbyRequestBody requestBody,
            Optional<String> appId,
            Optional<String> roomId) throws Exception;
    }


    public interface MethodCallCreatePrivateLobby {
        CreatePrivateLobbyResponse createPrivateLobby(
            CreatePrivateLobbySecurity security,
            CreatePrivateLobbyRequestBody requestBody,
            Optional<String> appId,
            Optional<String> roomId) throws Exception;
    }


    public interface MethodCallCreatePublicLobby {
        CreatePublicLobbyResponse createPublicLobby(
            CreatePublicLobbySecurity security,
            CreatePublicLobbyRequestBody requestBody,
            Optional<String> appId,
            Optional<String> roomId) throws Exception;
    }


    public interface MethodCallGetLobbyInfo {
        GetLobbyInfoResponse getLobbyInfo(
            Optional<String> appId,
            String roomId) throws Exception;
    }


    public interface MethodCallListActivePublicLobbiesDeprecatedV2 {
        ListActivePublicLobbiesDeprecatedV2Response listActivePublicLobbiesDeprecatedV2(
            Optional<String> appId,
            Optional<? extends Region> region) throws Exception;
    }


    public interface MethodCallSetLobbyState {
        SetLobbyStateResponse setLobbyState(
            SetLobbyStateParams setLobbyStateParams,
            Optional<String> appId,
            String roomId) throws Exception;
    }


    public interface MethodCallCreateLobby {
        CreateLobbyResponse createLobby(
            CreateLobbyRequest request,
            CreateLobbySecurity security) throws Exception;
    }


    public interface MethodCallGetLobbyInfoByRoomId {
        GetLobbyInfoByRoomIdResponse getLobbyInfoByRoomId(
            Optional<String> appId,
            String roomId) throws Exception;
    }


    public interface MethodCallGetLobbyInfoByShortCode {
        GetLobbyInfoByShortCodeResponse getLobbyInfoByShortCode(
            Optional<String> appId,
            String shortCode) throws Exception;
    }


    public interface MethodCallListActivePublicLobbies {
        ListActivePublicLobbiesResponse listActivePublicLobbies(
            Optional<String> appId,
            Optional<? extends Region> region) throws Exception;
    }


    public interface MethodCallDownloadLogForProcess {
        DownloadLogForProcessResponse downloadLogForProcess(
            Optional<String> appId,
            String processId) throws Exception;
    }


    public interface MethodCallGetLogsForProcess {
        GetLogsForProcessResponse getLogsForProcess(
            GetLogsForProcessRequest request) throws Exception;
    }


    public interface MethodCallSendVerificationEmail {
        SendVerificationEmailResponse sendVerificationEmail(
            VerificationEmailRequest request) throws Exception;
    }


    public interface MethodCallGetMetricsDeprecated {
        GetMetricsDeprecatedResponse getMetricsDeprecated(
            GetMetricsDeprecatedRequest request) throws Exception;
    }


    public interface MethodCallAcceptInvite {
        AcceptInviteResponse acceptInvite(
            String orgId) throws Exception;
    }


    public interface MethodCallGetOrgMembers {
        GetOrgMembersResponse getOrgMembers(
            String orgId) throws Exception;
    }


    public interface MethodCallGetOrgPendingInvites {
        GetOrgPendingInvitesResponse getOrgPendingInvites(
            String orgId) throws Exception;
    }


    public interface MethodCallGetOrgs {
        GetOrgsResponse getOrgsDirect() throws Exception;
    }


    public interface MethodCallGetUserPendingInvites {
        GetUserPendingInvitesResponse getUserPendingInvitesDirect() throws Exception;
    }


    public interface MethodCallInviteUser {
        InviteUserResponse inviteUser(
            CreateUserInvite createUserInvite,
            String orgId) throws Exception;
    }


    public interface MethodCallRejectInvite {
        RejectInviteResponse rejectInvite(
            String orgId) throws Exception;
    }


    public interface MethodCallRescindInvite {
        RescindInviteResponse rescindInvite(
            RescindUserInvite rescindUserInvite,
            String orgId) throws Exception;
    }


    public interface MethodCallGetProcessInfoDeprecated {
        GetProcessInfoDeprecatedResponse getProcessInfoDeprecated(
            Optional<String> appId,
            String processId) throws Exception;
    }


    public interface MethodCallGetRunningProcesses {
        GetRunningProcessesResponse getRunningProcesses(
            Optional<String> appId,
            Optional<? extends Region> region) throws Exception;
    }


    public interface MethodCallGetStoppedProcesses {
        GetStoppedProcessesResponse getStoppedProcesses(
            Optional<String> appId,
            Optional<? extends Region> region) throws Exception;
    }


    public interface MethodCallCreateProcessV2Deprecated {
        CreateProcessV2DeprecatedResponse createProcessV2Deprecated(
            Optional<String> appId,
            Region region) throws Exception;
    }


    public interface MethodCallGetLatestProcessesV2Deprecated {
        GetLatestProcessesV2DeprecatedResponse getLatestProcessesV2Deprecated(
            Optional<String> appId,
            Optional<? extends List<Region>> region,
            Optional<? extends List<ProcessStatus>> status) throws Exception;
    }


    public interface MethodCallGetProcessInfoV2Deprecated {
        GetProcessInfoV2DeprecatedResponse getProcessInfoV2Deprecated(
            Optional<String> appId,
            String processId) throws Exception;
    }


    public interface MethodCallGetProcessesCountExperimentalV2Deprecated {
        GetProcessesCountExperimentalV2DeprecatedResponse getProcessesCountExperimentalV2Deprecated(
            Optional<String> appId,
            Optional<? extends List<Region>> region,
            Optional<? extends List<ProcessStatus>> status) throws Exception;
    }


    public interface MethodCallStopProcessV2Deprecated {
        StopProcessV2DeprecatedResponse stopProcessV2Deprecated(
            Optional<String> appId,
            String processId) throws Exception;
    }


    public interface MethodCallCreateProcess {
        CreateProcessResponse createProcess(
            Optional<String> appId,
            Region region) throws Exception;
    }


    public interface MethodCallGetLatestProcesses {
        GetLatestProcessesResponse getLatestProcesses(
            Optional<String> appId,
            Optional<? extends List<Region>> region,
            Optional<? extends List<ProcessStatus>> status) throws Exception;
    }


    public interface MethodCallGetProcess {
        GetProcessResponse getProcess(
            Optional<String> appId,
            String processId) throws Exception;
    }


    public interface MethodCallGetProcessMetrics {
        GetProcessMetricsResponse getProcessMetrics(
            GetProcessMetricsRequest request) throws Exception;
    }


    public interface MethodCallGetProcessesCountExperimental {
        GetProcessesCountExperimentalResponse getProcessesCountExperimental(
            Optional<String> appId,
            Optional<? extends List<Region>> region,
            Optional<? extends List<ProcessStatus>> status) throws Exception;
    }


    public interface MethodCallStopProcess {
        StopProcessResponse stopProcess(
            Optional<String> appId,
            String processId) throws Exception;
    }


    public interface MethodCallCreateRoomDeprecated {
        CreateRoomDeprecatedResponse createRoomDeprecated(
            CreateRoomParams createRoomParams,
            Optional<String> appId,
            Optional<String> roomId) throws Exception;
    }


    public interface MethodCallDestroyRoomDeprecated {
        DestroyRoomDeprecatedResponse destroyRoomDeprecated(
            Optional<String> appId,
            String roomId) throws Exception;
    }


    public interface MethodCallGetActiveRoomsForProcessDeprecated {
        GetActiveRoomsForProcessDeprecatedResponse getActiveRoomsForProcessDeprecated(
            Optional<String> appId,
            String processId) throws Exception;
    }


    public interface MethodCallGetConnectionInfoDeprecated {
        GetConnectionInfoDeprecatedResponse getConnectionInfoDeprecated(
            Optional<String> appId,
            String roomId) throws Exception;
    }


    public interface MethodCallGetInactiveRoomsForProcessDeprecated {
        GetInactiveRoomsForProcessDeprecatedResponse getInactiveRoomsForProcessDeprecated(
            Optional<String> appId,
            String processId) throws Exception;
    }


    public interface MethodCallGetRoomInfoDeprecated {
        GetRoomInfoDeprecatedResponse getRoomInfoDeprecated(
            Optional<String> appId,
            String roomId) throws Exception;
    }


    public interface MethodCallSuspendRoomDeprecated {
        SuspendRoomDeprecatedResponse suspendRoomDeprecated(
            Optional<String> appId,
            String roomId) throws Exception;
    }


    public interface MethodCallCreateRoom {
        CreateRoomResponse createRoom(
            CreateRoomParams createRoomParams,
            Optional<String> appId,
            Optional<String> roomId) throws Exception;
    }


    public interface MethodCallDestroyRoom {
        DestroyRoomResponse destroyRoom(
            Optional<String> appId,
            String roomId) throws Exception;
    }


    public interface MethodCallGetActiveRoomsForProcess {
        GetActiveRoomsForProcessResponse getActiveRoomsForProcess(
            Optional<String> appId,
            String processId) throws Exception;
    }


    public interface MethodCallGetConnectionInfo {
        GetConnectionInfoResponse getConnectionInfo(
            Optional<String> appId,
            String roomId) throws Exception;
    }


    public interface MethodCallGetInactiveRoomsForProcess {
        GetInactiveRoomsForProcessResponse getInactiveRoomsForProcess(
            Optional<String> appId,
            String processId) throws Exception;
    }


    public interface MethodCallGetRoomInfo {
        GetRoomInfoResponse getRoomInfo(
            Optional<String> appId,
            String roomId) throws Exception;
    }


    public interface MethodCallSuspendRoomV2Deprecated {
        SuspendRoomV2DeprecatedResponse suspendRoomV2Deprecated(
            Optional<String> appId,
            String roomId) throws Exception;
    }


    public interface MethodCallUpdateRoomConfig {
        UpdateRoomConfigResponse updateRoomConfig(
            UpdateRoomConfigParams updateRoomConfigParams,
            Optional<String> appId,
            String roomId) throws Exception;
    }


    public interface MethodCallCreateOrgToken {
        CreateOrgTokenResponse createOrgToken(
            CreateOrgToken createOrgToken,
            String orgId) throws Exception;
    }


    public interface MethodCallGetOrgTokens {
        GetOrgTokensResponse getOrgTokens(
            String orgId) throws Exception;
    }


    public interface MethodCallRevokeOrgToken {
        RevokeOrgTokenResponse revokeOrgToken(
            String orgId,
            String orgTokenId) throws Exception;
    }


}
