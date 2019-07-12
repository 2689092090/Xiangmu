package cn.appinfodb.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AppInfo {
	private Integer id;//主键id
	private String softwareName;//软件名称
	private String APKName;//APK名称
	private String supportROM;//支持ROM
	private String interfaceLanguage;//界面语言
	private Date updateDate;//更新日期
	private BigDecimal softwareSize;//软件大小（单位：M）
	private Integer devId;//开发者id
	private String appInfo;//应用简介
	private Integer status;//app状态id
	private Date onSaleDate;//上架时间
	private Date offSaleDate;//下架时间
	private Integer categoryLevel3;//所属三级分类id
	private Integer downloads;//下载量（单位：次）
	private Integer flatformId;//app所属平台id
	private Integer createdBy;//创建者
	private Date creationDate;//创建时间
	private Integer modifyBy;//更新者
	private Date modifyDate;//更新时间
	
	private String statusName;//app状态名称
	private String flatformName;//app所属平台名称
	private String  categoryName3;//所属三级分类名称
	private String devName;//开发者名称
	
	private Integer categoryLevel1;//所属一级分类id
	private Integer categoryLevel2;//所属二级分类id
	
	private String  categoryName1;//所属一级分类名称
	private String  categoryName2;//所属二级分类名称
	
	private String logoPicPath;//LOGO图片URL路径
	private String logoLocPath;//LOGO图片的服务器存储路径
	
	private Integer versionId;//最新的版本id
	private String versionNo;//最新的版本号
		
	public String getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public Integer getVersionId() {
		return versionId;
	}
	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}
	public String getLogoLocPath() {
		return logoLocPath;
	}
	public void setLogoLocPath(String logoLocPath) {
		this.logoLocPath = logoLocPath;
	}
	public String getLogoPicPath() {
		return logoPicPath;
	}
	public void setLogoPicPath(String logoPicPath) {
		this.logoPicPath = logoPicPath;
	}
	public Integer getCategoryLevel3() {
		return categoryLevel3;
	}
	public void setCategoryLevel3(Integer categoryLevel3) {
		this.categoryLevel3 = categoryLevel3;
	}
	
	public String getCategoryName3() {
		return categoryName3;
	}
	public void setCategoryName3(String categoryName3) {
		this.categoryName3 = categoryName3;
	}
	public String getCategoryName1() {
		return categoryName1;
	}
	public void setCategoryName1(String categoryName1) {
		this.categoryName1 = categoryName1;
	}
	public String getCategoryName2() {
		return categoryName2;
	}
	public void setCategoryName2(String categoryName2) {
		this.categoryName2 = categoryName2;
	}
	public Integer getCategoryLevel1() {
		return categoryLevel1;
	}
	public void setCategoryLevel1(Integer categoryLevel1) {
		this.categoryLevel1 = categoryLevel1;
	}
	public Integer getCategoryLevel2() {
		return categoryLevel2;
	}
	public void setCategoryLevel2(Integer categoryLevel2) {
		this.categoryLevel2 = categoryLevel2;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public String getFlatformName() {
		return flatformName;
	}
	public void setFlatformName(String flatformName) {
		this.flatformName = flatformName;
	}
	
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSoftwareName() {
		return softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	public String getAPKName() {
		return APKName;
	}
	public void setAPKName(String aPKName) {
		APKName = aPKName;
	}
	public String getSupportROM() {
		return supportROM;
	}
	public void setSupportROM(String supportROM) {
		this.supportROM = supportROM;
	}
	public String getInterfaceLanguage() {
		return interfaceLanguage;
	}
	public void setInterfaceLanguage(String interfaceLanguage) {
		this.interfaceLanguage = interfaceLanguage;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public BigDecimal getSoftwareSize() {
		return softwareSize;
	}
	public void setSoftwareSize(BigDecimal softwareSize) {
		this.softwareSize = softwareSize;
	}
	public Integer getDevId() {
		return devId;
	}
	public void setDevId(Integer devId) {
		this.devId = devId;
	}
	public String getAppInfo() {
		return appInfo;
	}
	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getOnSaleDate() {
		return onSaleDate;
	}
	public void setOnSaleDate(Date onSaleDate) {
		this.onSaleDate = onSaleDate;
	}
	public Date getOffSaleDate() {
		return offSaleDate;
	}
	public void setOffSaleDate(Date offSaleDate) {
		this.offSaleDate = offSaleDate;
	}
	
	public Integer getDownloads() {
		return downloads;
	}
	public void setDownloads(Integer downloads) {
		this.downloads = downloads;
	}
	public Integer getFlatformId() {
		return flatformId;
	}
	public void setFlatformId(Integer flatformId) {
		this.flatformId = flatformId;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Integer getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
}
