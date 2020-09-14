package mybatisday1;

import java.util.Date;

public class Doctor {
    private Integer id;
    private String uniqueMark;
    private String doctIm;
    private String phoneNum;
    private String password;
    private String corpId;
    private String corpName;
    private String doctCode;
    private String doctName;
    private String doctLogo;
    private String profeCode;
    private String profeName;
    private String doctIntro;
    private String doctSpec;
    private long inquiryStatus;
    private String inquiryFee;
    private String maxInquiryNum;
    private String doctToken;
    private long hasPlan;
    private String regStatus;
    private String auth_code;
    private String status;
    private String sex;
    private String valiName;
    private String idType;
    private String idNo;
    private String signAccountId;
    private String signImg;
    private String unionId;
    private Date gmtCreate;
    private Date gmtModify;
    private String specializeDisease;
    private String doctType;
    private String qualification;
    private String deptCode;
    private String deptName;
    private String doctPiros;
    private String consultationCode;

    public Doctor(){
        this.gmtCreate = new Date();
        this.gmtModify = new Date();
        this.inquiryStatus =1;
        this.hasPlan =1;
    }




    public void setId(Integer id) {
        this.id = id;
    }

    public void setUniqueMark(String uniqueMark) {
        this.uniqueMark = uniqueMark;
    }

    public void setDoctIm(String doctIm) {
        this.doctIm = doctIm;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public void setDoctName(String doctName) {
        this.doctName = doctName;
    }

    public void setDoctLogo(String doctLogo) {
        this.doctLogo = doctLogo;
    }

    public void setProfeCode(String profeCode) {
        this.profeCode = profeCode;
    }

    public void setProfeName(String profeName) {
        this.profeName = profeName;
    }

    public void setDoctIntro(String doctIntro) {
        this.doctIntro = doctIntro;
    }

    public void setDoctSpec(String doctSpec) {
        this.doctSpec = doctSpec;
    }

    public void setInquiryStatus(long inquiryStatus) {
        this.inquiryStatus = inquiryStatus;
    }

    public void setInquiryFee(String inquiryFee) {
        this.inquiryFee = inquiryFee;
    }

    public void setMaxInquiryNum(String maxInquiryNum) {
        this.maxInquiryNum = maxInquiryNum;
    }

    public void setDoctToken(String doctToken) {
        this.doctToken = doctToken;
    }

    public void setHasPlan(long hasPlan) {
        this.hasPlan = hasPlan;
    }

    public void setRegStatus(String regStatus) {
        this.regStatus = regStatus;
    }

    public void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setValiName(String valiName) {
        this.valiName = valiName;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public void setSignAccountId(String signAccountId) {
        this.signAccountId = signAccountId;
    }

    public void setSignImg(String signImg) {
        this.signImg = signImg;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public void setSpecializeDisease(String specializeDisease) {
        this.specializeDisease = specializeDisease;
    }

    public void setDoctType(String doctType) {
        this.doctType = doctType;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setDoctPiros(String doctPiros) {
        this.doctPiros = doctPiros;
    }

    public void setConsultationCode(String consultationCode) {
        this.consultationCode = consultationCode;
    }

    public Integer getId() {
        return id;
    }

    public String getUniqueMark() {
        return uniqueMark;
    }

    public String getDoctIm() {
        return doctIm;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getPassword() {
        return password;
    }

    public String getCorpId() {
        return corpId;
    }

    public String getCorpName() {
        return corpName;
    }

    public String getDoctCode() {
        return doctCode;
    }

    public String getDoctName() {
        return doctName;
    }

    public String getDoctLogo() {
        return doctLogo;
    }

    public String getProfeCode() {
        return profeCode;
    }

    public String getProfeName() {
        return profeName;
    }

    public String getDoctIntro() {
        return doctIntro;
    }

    public String getDoctSpec() {
        return doctSpec;
    }

    public long getInquiryStatus() {
        return inquiryStatus;
    }

    public String getInquiryFee() {
        return inquiryFee;
    }

    public String getMaxInquiryNum() {
        return maxInquiryNum;
    }

    public String getDoctToken() {
        return doctToken;
    }

    public long getHasPlan() {
        return hasPlan;
    }

    public String getRegStatus() {
        return regStatus;
    }

    public String getAuth_code() {
        return auth_code;
    }

    public String getStatus() {
        return status;
    }

    public String getSex() {
        return sex;
    }

    public String getValiName() {
        return valiName;
    }

    public String getIdType() {
        return idType;
    }

    public String getIdNo() {
        return idNo;
    }

    public String getSignAccountId() {
        return signAccountId;
    }

    public String getSignImg() {
        return signImg;
    }

    public String getUnionId() {
        return unionId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public String getSpecializeDisease() {
        return specializeDisease;
    }

    public String getDoctType() {
        return doctType;
    }

    public String getQualification() {
        return qualification;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getDoctPiros() {
        return doctPiros;
    }

    public String getConsultationCode() {
        return consultationCode;
    }
}
