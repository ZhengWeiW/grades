package com.dream.grades.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Title: StudentScore.java
 * @Description: 成绩表实体
 * @author  zww
 * @date 2020年7月22日上午11:13:45
 * @Return StudentScore
 * 
 */

public class StudentScore implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	//考试活动名称
	private String activeName;
	
	//打分次
	private String testPaperAorB;
	
	//学校id
	private int schoolId;
	
	//考生学校
	private String schoolName;
	
	//考生班级
	private String grade;
	
	//考生班别
	private String StuClass;
	
	//考生学籍号
	private String onesName;
	
	//考生姓名
	private String studentName;
	
	//学号
	private String studentNo;
	
	//考生语文科目
	private String chinseCourseName;
	
	//语文成绩
	private BigDecimal chineseScore;
	
	//考生数学科目
	private String mathCourseName;
	
	//数学成绩
	private BigDecimal mathScore;
	
	//考生英语科目
	private String englishCourseName;
	
	//考生英语成绩
	private BigDecimal englishScore;
	
	//考生座位号
	private String seatNo;
	
	//考勤备注
	private String causeRemark;
	
	//打分老师名称
	private String teacherName;
	
	//打分老师学校名称
	private String schoolNameTeacher;
	
	//打分插入时间
	private Date insertTime;
	
	//打分修改时间
	private String updateTime;
	
	//修改老师
	private String updateTeacher;
	
	//打分次数
	private String scoreCount;

	public String getActiveName() {
		return activeName;
	}

	public void setActiveName(String activeName) {
		this.activeName = activeName;
	}

	public String getTestPaperAorB() {
		return testPaperAorB;
	}

	public void setTestPaperAorB(String testPaperAorB) {
		this.testPaperAorB = testPaperAorB;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getStuClass() {
		return StuClass;
	}

	public void setStuClass(String stuClass) {
		StuClass = stuClass;
	}

	public String getOnesName() {
		return onesName;
	}

	public void setOnesName(String onesName) {
		this.onesName = onesName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getChinseCourseName() {
		return chinseCourseName;
	}

	public void setChinseCourseName(String chinseCourseName) {
		this.chinseCourseName = chinseCourseName;
	}

	public BigDecimal getChineseScore() {
		return chineseScore;
	}

	public void setChineseScore(BigDecimal chineseScore) {
		this.chineseScore = chineseScore;
	}

	public String getMathCourseName() {
		return mathCourseName;
	}

	public void setMathCourseName(String mathCourseName) {
		this.mathCourseName = mathCourseName;
	}

	public BigDecimal getMathScore() {
		return mathScore;
	}

	public void setMathScore(BigDecimal mathScore) {
		this.mathScore = mathScore;
	}

	public String getEnglishCourseName() {
		return englishCourseName;
	}

	public void setEnglishCourseName(String englishCourseName) {
		this.englishCourseName = englishCourseName;
	}

	public BigDecimal getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(BigDecimal englishScore) {
		this.englishScore = englishScore;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public String getCauseRemark() {
		return causeRemark;
	}

	public void setCauseRemark(String causeRemark) {
		this.causeRemark = causeRemark;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getSchoolNameTeacher() {
		return schoolNameTeacher;
	}

	public void setSchoolNameTeacher(String schoolNameTeacher) {
		this.schoolNameTeacher = schoolNameTeacher;
	}

	public Date getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateTeacher() {
		return updateTeacher;
	}

	public void setUpdateTeacher(String updateTeacher) {
		this.updateTeacher = updateTeacher;
	}

	public String getScoreCount() {
		return scoreCount;
	}

	public void setScoreCount(String scoreCount) {
		this.scoreCount = scoreCount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "StudentScore [activeName=" + activeName + ", testPaperAorB=" + testPaperAorB + ", schoolId=" + schoolId
				+ ", schoolName=" + schoolName + ", grade=" + grade + ", StuClass=" + StuClass + ", onesName="
				+ onesName + ", studentName=" + studentName + ", studentNo=" + studentNo + ", chinseCourseName="
				+ chinseCourseName + ", chineseScore=" + chineseScore + ", mathCourseName=" + mathCourseName
				+ ", mathScore=" + mathScore + ", englishCourseName=" + englishCourseName + ", englishScore="
				+ englishScore + ", seatNo=" + seatNo + ", causeRemark=" + causeRemark + ", teacherName=" + teacherName
				+ ", schoolNameTeacher=" + schoolNameTeacher + ", insertTime=" + insertTime + ", updateTime="
				+ updateTime + ", updateTeacher=" + updateTeacher + ", scoreCount=" + scoreCount + "]";
	}
	
	

}
