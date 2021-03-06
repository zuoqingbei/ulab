package com.ulab.client.IntegrationService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.3
 * 2017-05-02T15:46:28.170+08:00
 * Generated source version: 2.4.3
 * 
 */
@WebService(targetNamespace = "http://DefaultNamespace", name = "servicePortType")
@XmlSeeAlso({ObjectFactory.class})
public interface ServicePortType {

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getStdTermByStdId", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetStdTermByStdId")
    @WebMethod
    @ResponseWrapper(localName = "getStdTermByStdIdResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetStdTermByStdIdResponse")
    public com.ulab.client.IntegrationService.ArrayOfTbStdTerm getStdTermByStdId(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        int in0
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getModuleCompanyInfo", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetModuleCompanyInfo")
    @WebMethod
    @ResponseWrapper(localName = "getModuleCompanyInfoResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetModuleCompanyInfoResponse")
    public com.ulab.client.IntegrationService.ArrayOfModuleCompanyInfo getModuleCompanyInfo();

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getConnInfoByModuleCompanyId", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetConnInfoByModuleCompanyId")
    @WebMethod
    @ResponseWrapper(localName = "getConnInfoByModuleCompanyIdResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetConnInfoByModuleCompanyIdResponse")
    public com.ulab.client.IntegrationService.ArrayOfConnInfo getConnInfoByModuleCompanyId(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        int in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        int in1
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "checkUser", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.CheckUser")
    @WebMethod
    @ResponseWrapper(localName = "checkUserResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.CheckUserResponse")
    public int checkUser(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        java.lang.String in1
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getRoleInfo", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetRoleInfo")
    @WebMethod
    @ResponseWrapper(localName = "getRoleInfoResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetRoleInfoResponse")
    public com.ulab.client.IntegrationService.ArrayOfRoleInfo getRoleInfo();

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "isUserExisted", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.IsUserExisted")
    @WebMethod
    @ResponseWrapper(localName = "isUserExistedResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.IsUserExistedResponse")
    public int isUserExisted(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "deleteWebServiceInf", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.DeleteWebServiceInf")
    @WebMethod
    @ResponseWrapper(localName = "deleteWebServiceInfResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.DeleteWebServiceInfResponse")
    public boolean deleteWebServiceInf(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        int in0
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getTestUnitByCode", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetTestUnitByCode")
    @WebMethod
    @ResponseWrapper(localName = "getTestUnitByCodeResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetTestUnitByCodeResponse")
    public com.ulab.client.IntegrationService.ArrayOfTestUnitConfig getTestUnitByCode(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getUserLab", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetUserLab")
    @WebMethod
    @ResponseWrapper(localName = "getUserLabResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetUserLabResponse")
    public com.ulab.client.IntegrationService.ArrayOfUserLab getUserLab(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getUserInfo", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetUserInfo")
    @WebMethod
    @ResponseWrapper(localName = "getUserInfoResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetUserInfoResponse")
    public com.ulab.client.IntegrationService.UserInfo getUserInfo(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        java.lang.String in1
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "updateWebServiceInf", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.UpdateWebServiceInf")
    @WebMethod
    @ResponseWrapper(localName = "updateWebServiceInfResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.UpdateWebServiceInfResponse")
    public boolean updateWebServiceInf(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        java.lang.String in1,
        @WebParam(name = "in2", targetNamespace = "http://DefaultNamespace")
        java.lang.String in2,
        @WebParam(name = "in3", targetNamespace = "http://DefaultNamespace")
        java.lang.String in3,
        @WebParam(name = "in4", targetNamespace = "http://DefaultNamespace")
        int in4
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getResearchDevelopmentCenterInfo", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetResearchDevelopmentCenterInfo")
    @WebMethod
    @ResponseWrapper(localName = "getResearchDevelopmentCenterInfoResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetResearchDevelopmentCenterInfoResponse")
    public com.ulab.client.IntegrationService.ArrayOfResearchDevelopmentCenterInfo getResearchDevelopmentCenterInfo();

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getConnInfoAllByUserName", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetConnInfoAllByUserName")
    @WebMethod
    @ResponseWrapper(localName = "getConnInfoAllByUserNameResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetConnInfoAllByUserNameResponse")
    public com.ulab.client.IntegrationService.ArrayOfConnInfo getConnInfoAllByUserName(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0
    );

    @RequestWrapper(localName = "writeLog", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.WriteLog")
    @WebMethod
    @ResponseWrapper(localName = "writeLogResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.WriteLogResponse")
    public void writeLog(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        int in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        java.lang.String in1,
        @WebParam(name = "in2", targetNamespace = "http://DefaultNamespace")
        java.lang.String in2
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getSubWindowInfo", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetSubWindowInfo")
    @WebMethod
    @ResponseWrapper(localName = "getSubWindowInfoResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetSubWindowInfoResponse")
    public com.ulab.client.IntegrationService.ArrayOfSubWindowInfo getSubWindowInfo(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        int in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        int in1
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "addUser", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.AddUser")
    @WebMethod
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.AddUserResponse")
    public int addUser(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        java.lang.String in1,
        @WebParam(name = "in2", targetNamespace = "http://DefaultNamespace")
        java.lang.String in2,
        @WebParam(name = "in3", targetNamespace = "http://DefaultNamespace")
        java.lang.String in3,
        @WebParam(name = "in4", targetNamespace = "http://DefaultNamespace")
        java.lang.String in4,
        @WebParam(name = "in5", targetNamespace = "http://DefaultNamespace")
        int in5,
        @WebParam(name = "in6", targetNamespace = "http://DefaultNamespace")
        java.lang.String in6,
        @WebParam(name = "in7", targetNamespace = "http://DefaultNamespace")
        int in7,
        @WebParam(name = "in8", targetNamespace = "http://DefaultNamespace")
        java.lang.String in8,
        @WebParam(name = "in9", targetNamespace = "http://DefaultNamespace")
        java.lang.String in9,
        @WebParam(name = "in10", targetNamespace = "http://DefaultNamespace")
        java.lang.String in10
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "deleteUser", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.DeleteUser")
    @WebMethod
    @ResponseWrapper(localName = "deleteUserResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.DeleteUserResponse")
    public boolean deleteUser(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getConnInfoAll", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetConnInfoAll")
    @WebMethod
    @ResponseWrapper(localName = "getConnInfoAllResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetConnInfoAllResponse")
    public com.ulab.client.IntegrationService.ArrayOfConnInfo getConnInfoAll();

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "AddAuthority", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.AddAuthority")
    @WebMethod(operationName = "AddAuthority")
    @ResponseWrapper(localName = "AddAuthorityResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.AddAuthorityResponse")
    public int addAuthority(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        int in1,
        @WebParam(name = "in2", targetNamespace = "http://DefaultNamespace")
        int in2
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getIndustrialParkInfo", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetIndustrialParkInfo")
    @WebMethod
    @ResponseWrapper(localName = "getIndustrialParkInfoResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetIndustrialParkInfoResponse")
    public com.ulab.client.IntegrationService.ArrayOfIndustrialParkInfo getIndustrialParkInfo();

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getItemContentNum", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetItemContentNum")
    @WebMethod
    @ResponseWrapper(localName = "getItemContentNumResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetItemContentNumResponse")
    public com.ulab.client.IntegrationService.ArrayOfTestProdInfoValue getItemContentNum(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        java.lang.String in1,
        @WebParam(name = "in2", targetNamespace = "http://DefaultNamespace")
        java.lang.String in2
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getConnInfoByRDCId", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetConnInfoByRDCId")
    @WebMethod
    @ResponseWrapper(localName = "getConnInfoByRDCIdResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetConnInfoByRDCIdResponse")
    public com.ulab.client.IntegrationService.ArrayOfConnInfo getConnInfoByRDCId(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        int in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        int in1
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getWindowInfo", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetWindowInfo")
    @WebMethod
    @ResponseWrapper(localName = "getWindowInfoResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetWindowInfoResponse")
    public com.ulab.client.IntegrationService.ArrayOfWindowInfo getWindowInfo(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        int in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        int in1
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "updateDepartment", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.UpdateDepartment")
    @WebMethod
    @ResponseWrapper(localName = "updateDepartmentResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.UpdateDepartmentResponse")
    public boolean updateDepartment(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        int in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        java.lang.String in1,
        @WebParam(name = "in2", targetNamespace = "http://DefaultNamespace")
        java.lang.String in2
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "insertWebServiceInf", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.InsertWebServiceInf")
    @WebMethod
    @ResponseWrapper(localName = "insertWebServiceInfResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.InsertWebServiceInfResponse")
    public int insertWebServiceInf(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        java.lang.String in1,
        @WebParam(name = "in2", targetNamespace = "http://DefaultNamespace")
        java.lang.String in2,
        @WebParam(name = "in3", targetNamespace = "http://DefaultNamespace")
        java.lang.String in3,
        @WebParam(name = "in4", targetNamespace = "http://DefaultNamespace")
        int in4
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getKeyItem", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetKeyItem")
    @WebMethod
    @ResponseWrapper(localName = "getKeyItemResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetKeyItemResponse")
    public com.ulab.client.IntegrationService.ConnInfoItemVo getKeyItem(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        java.lang.String in1
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "insertUserLab", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.InsertUserLab")
    @WebMethod
    @ResponseWrapper(localName = "insertUserLabResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.InsertUserLabResponse")
    public boolean insertUserLab(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        java.lang.String in1,
        @WebParam(name = "in2", targetNamespace = "http://DefaultNamespace")
        java.lang.String in2
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "insertDepartment", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.InsertDepartment")
    @WebMethod
    @ResponseWrapper(localName = "insertDepartmentResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.InsertDepartmentResponse")
    public int insertDepartment(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        java.lang.String in1,
        @WebParam(name = "in2", targetNamespace = "http://DefaultNamespace")
        java.lang.String in2
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getCoordinationInfo", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetCoordinationInfo")
    @WebMethod
    @ResponseWrapper(localName = "getCoordinationInfoResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetCoordinationInfoResponse")
    public com.ulab.client.IntegrationService.ArrayOfCoordinationInfo getCoordinationInfo(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        int in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        int in1
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "updateUserPWD", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.UpdateUserPWD")
    @WebMethod
    @ResponseWrapper(localName = "updateUserPWDResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.UpdateUserPWDResponse")
    public int updateUserPWD(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        java.lang.String in1
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getStdByPDName", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetStdByPDName")
    @WebMethod
    @ResponseWrapper(localName = "getStdByPDNameResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetStdByPDNameResponse")
    public com.ulab.client.IntegrationService.ArrayOfTbStd getStdByPDName(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "deleteAuthority", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.DeleteAuthority")
    @WebMethod
    @ResponseWrapper(localName = "deleteAuthorityResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.DeleteAuthorityResponse")
    public boolean deleteAuthority(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getTestProdInfoNewest", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetTestProdInfoNewest")
    @WebMethod
    @ResponseWrapper(localName = "getTestProdInfoNewestResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetTestProdInfoNewestResponse")
    public com.ulab.client.IntegrationService.ArrayOfTestProdInfoValue getTestProdInfoNewest(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        int in1
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getUsersByDepartId", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetUsersByDepartId")
    @WebMethod
    @ResponseWrapper(localName = "getUsersByDepartIdResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetUsersByDepartIdResponse")
    public com.ulab.client.IntegrationService.ArrayOfUserInfo getUsersByDepartId(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        int in0
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getVideoInformationInfo", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetVideoInformationInfo")
    @WebMethod
    @ResponseWrapper(localName = "getVideoInformationInfoResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetVideoInformationInfoResponse")
    public com.ulab.client.IntegrationService.ArrayOfVideoInformationInfo getVideoInformationInfo(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        int in0
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getWebServiceInfoByusername", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetWebServiceInfoByusername")
    @WebMethod
    @ResponseWrapper(localName = "getWebServiceInfoByusernameResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetWebServiceInfoByusernameResponse")
    public com.ulab.client.IntegrationService.ArrayOfWebServiceInfo getWebServiceInfoByusername(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getCoordinationInfomation", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetCoordinationInfomation")
    @WebMethod
    @ResponseWrapper(localName = "getCoordinationInfomationResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetCoordinationInfomationResponse")
    public com.ulab.client.IntegrationService.ArrayOfCoordinationInfo getCoordinationInfomation(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        int in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        int in1,
        @WebParam(name = "in2", targetNamespace = "http://DefaultNamespace")
        int in2
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getWebServiceInfo", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetWebServiceInfo")
    @WebMethod
    @ResponseWrapper(localName = "getWebServiceInfoResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetWebServiceInfoResponse")
    public com.ulab.client.IntegrationService.ArrayOfWebServiceInfo getWebServiceInfo(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        int in0
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "deleteDepartment", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.DeleteDepartment")
    @WebMethod
    @ResponseWrapper(localName = "deleteDepartmentResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.DeleteDepartmentResponse")
    public boolean deleteDepartment(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        int in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        java.lang.Boolean in1
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getConnInfoByIndustrialParkId", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetConnInfoByIndustrialParkId")
    @WebMethod
    @ResponseWrapper(localName = "getConnInfoByIndustrialParkIdResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetConnInfoByIndustrialParkIdResponse")
    public com.ulab.client.IntegrationService.ArrayOfConnInfo getConnInfoByIndustrialParkId(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        int in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        int in1
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "countByItem", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.CountByItem")
    @WebMethod
    @ResponseWrapper(localName = "countByItemResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.CountByItemResponse")
    public int countByItem(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        java.lang.String in1,
        @WebParam(name = "in2", targetNamespace = "http://DefaultNamespace")
        java.lang.String in2
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getWebServiceBySampleNo", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetWebServiceBySampleNo")
    @WebMethod
    @ResponseWrapper(localName = "getWebServiceBySampleNoResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetWebServiceBySampleNoResponse")
    public com.ulab.client.IntegrationService.ArrayOfWebServiceInfo getWebServiceBySampleNo(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getVideoInformationAll", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetVideoInformationAll")
    @WebMethod
    @ResponseWrapper(localName = "getVideoInformationAllResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetVideoInformationAllResponse")
    public com.ulab.client.IntegrationService.ArrayOfVideoInformationInfo getVideoInformationAll();

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getSubWindowInformation", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetSubWindowInformation")
    @WebMethod
    @ResponseWrapper(localName = "getSubWindowInformationResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetSubWindowInformationResponse")
    public com.ulab.client.IntegrationService.ArrayOfSubWindowInfo getSubWindowInformation(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        int in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        int in1,
        @WebParam(name = "in2", targetNamespace = "http://DefaultNamespace")
        int in2
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "updateUser", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.UpdateUser")
    @WebMethod
    @ResponseWrapper(localName = "updateUserResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.UpdateUserResponse")
    public int updateUser(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        java.lang.String in1,
        @WebParam(name = "in2", targetNamespace = "http://DefaultNamespace")
        java.lang.String in2,
        @WebParam(name = "in3", targetNamespace = "http://DefaultNamespace")
        java.lang.String in3,
        @WebParam(name = "in4", targetNamespace = "http://DefaultNamespace")
        java.lang.String in4,
        @WebParam(name = "in5", targetNamespace = "http://DefaultNamespace")
        int in5,
        @WebParam(name = "in6", targetNamespace = "http://DefaultNamespace")
        java.lang.String in6,
        @WebParam(name = "in7", targetNamespace = "http://DefaultNamespace")
        int in7,
        @WebParam(name = "in8", targetNamespace = "http://DefaultNamespace")
        java.lang.String in8,
        @WebParam(name = "in9", targetNamespace = "http://DefaultNamespace")
        java.lang.String in9,
        @WebParam(name = "in10", targetNamespace = "http://DefaultNamespace")
        java.lang.String in10
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getDepartmentUserCount", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetDepartmentUserCount")
    @WebMethod
    @ResponseWrapper(localName = "getDepartmentUserCountResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetDepartmentUserCountResponse")
    public int getDepartmentUserCount(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        int in0
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getSensorInfo", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetSensorInfo")
    @WebMethod
    @ResponseWrapper(localName = "getSensorInfoResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetSensorInfoResponse")
    public com.ulab.client.IntegrationService.ArrayOfSensorInfo getSensorInfo(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        int in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        int in1
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "unitStatus", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.UnitStatus")
    @WebMethod
    @ResponseWrapper(localName = "unitStatusResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.UnitStatusResponse")
    public com.ulab.client.IntegrationService.ArrayOfTestUnitConfig unitStatus(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getSensorInfo1", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetSensorInfo1")
    @WebMethod
    @ResponseWrapper(localName = "getSensorInfo1Response", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetSensorInfo1Response")
    public com.ulab.client.IntegrationService.ArrayOfSensorInfo getSensorInfo1(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        int in0,
        @WebParam(name = "in1", targetNamespace = "http://DefaultNamespace")
        int in1,
        @WebParam(name = "in2", targetNamespace = "http://DefaultNamespace")
        int in2
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getUserDepartment", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetUserDepartment")
    @WebMethod
    @ResponseWrapper(localName = "getUserDepartmentResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetUserDepartmentResponse")
    public com.ulab.client.IntegrationService.ArrayOfDepartment getUserDepartment(
        @WebParam(name = "in0", targetNamespace = "http://DefaultNamespace")
        java.lang.String in0
    );

    @WebResult(name = "out", targetNamespace = "http://DefaultNamespace")
    @RequestWrapper(localName = "getProductInfo", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetProductInfo")
    @WebMethod
    @ResponseWrapper(localName = "getProductInfoResponse", targetNamespace = "http://DefaultNamespace", className = "com.ulab.client.IntegrationService.GetProductInfoResponse")
    public com.ulab.client.IntegrationService.ArrayOfProduct getProductInfo();
}
