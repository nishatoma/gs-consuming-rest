
package com.example.consumingrest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Company {

    @JsonProperty("bs_company_statement")
    private String mBsCompanyStatement;
    @JsonProperty("business_name")
    private String mBusinessName;
    @JsonProperty("buzzword")
    private String mBuzzword;
    @JsonProperty("catch_phrase")
    private String mCatchPhrase;
    @JsonProperty("duns_number")
    private String mDunsNumber;
    @JsonProperty("employee_identification_number")
    private String mEmployeeIdentificationNumber;
    @JsonProperty("full_address")
    private String mFullAddress;
    @JsonProperty("id")
    private Long mId;
    @JsonProperty("industry")
    private String mIndustry;
    @JsonProperty("latitude")
    private Double mLatitude;
    @JsonProperty("logo")
    private String mLogo;
    @JsonProperty("longitude")
    private Double mLongitude;
    @JsonProperty("phone_number")
    private String mPhoneNumber;
    @JsonProperty("suffix")
    private String mSuffix;
    @JsonProperty("type")
    private String mType;
    @JsonProperty("uid")
    private String mUid;

    public String getBsCompanyStatement() {
        return mBsCompanyStatement;
    }

    public void setBsCompanyStatement(String bsCompanyStatement) {
        mBsCompanyStatement = bsCompanyStatement;
    }

    public String getBusinessName() {
        return mBusinessName;
    }

    public void setBusinessName(String businessName) {
        mBusinessName = businessName;
    }

    public String getBuzzword() {
        return mBuzzword;
    }

    public void setBuzzword(String buzzword) {
        mBuzzword = buzzword;
    }

    public String getCatchPhrase() {
        return mCatchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        mCatchPhrase = catchPhrase;
    }

    public String getDunsNumber() {
        return mDunsNumber;
    }

    public void setDunsNumber(String dunsNumber) {
        mDunsNumber = dunsNumber;
    }

    public String getEmployeeIdentificationNumber() {
        return mEmployeeIdentificationNumber;
    }

    public void setEmployeeIdentificationNumber(String employeeIdentificationNumber) {
        mEmployeeIdentificationNumber = employeeIdentificationNumber;
    }

    public String getFullAddress() {
        return mFullAddress;
    }

    public void setFullAddress(String fullAddress) {
        mFullAddress = fullAddress;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getIndustry() {
        return mIndustry;
    }

    public void setIndustry(String industry) {
        mIndustry = industry;
    }

    public Double getLatitude() {
        return mLatitude;
    }

    public void setLatitude(Double latitude) {
        mLatitude = latitude;
    }

    public String getLogo() {
        return mLogo;
    }

    public void setLogo(String logo) {
        mLogo = logo;
    }

    public Double getLongitude() {
        return mLongitude;
    }

    public void setLongitude(Double longitude) {
        mLongitude = longitude;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        mPhoneNumber = phoneNumber;
    }

    public String getSuffix() {
        return mSuffix;
    }

    public void setSuffix(String suffix) {
        mSuffix = suffix;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public String getUid() {
        return mUid;
    }

    public void setUid(String uid) {
        mUid = uid;
    }

    @Override
    public String toString() {
        return "Company{" +
                "mBsCompanyStatement='" + mBsCompanyStatement + '\'' +
                ", mBusinessName='" + mBusinessName + '\'' +
                ", mCatchPhrase='" + mCatchPhrase + '\'' +
                '}';
    }
}
