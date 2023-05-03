package kh.com.job.board.model.dto;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BoardDto {
//  DESC BOARD;
//	BOARD_NO                NOT NULL NUMBER        
//	USER_ID                 NOT NULL VARCHAR2(20)  
//	CATEGORY_ID             NOT NULL VARCHAR2(20)  
//	BOARD_TITLE             NOT NULL VARCHAR2(100) 
//	BOARD_CONTENT                    CLOB          
//	BOARD_DATE                       TIMESTAMP(6)  
//	UPDATE_DATE                      TIMESTAMP(6)  
//	BOARD_ORIGINAL_FILENAME          VARCHAR2(100) 
//	BOARD_RENAME_FILENAME            VARCHAR2(100) 
//	BOARD_READ                       NUMBER        
//	BOARD_LIKE                       NUMBER        
//	TAG                              VARCHAR2(200) 
//	SALARY_AVG                       VARCHAR2(100) 
//	EMPLOYEE                         VARCHAR2(100) 
//	LINK                             VARCHAR2(100) 
//	LINK_TITLE 						 VARCHAR2(100);
	
		private int boardNo;
		private String userId;
		private String userName;
		private String categoryId;
		private String boardTitle;
		private String boardContent;
		private String boardDate;
		private String updateDate;
		private String boardOriginalFilename;
		private String boardRenameFilename;
		private int boardRead;
		private int boardLike;
		private String tag;
		private String salaryAvg;
		private String employee;
		private String link;
		private String linkTitle;
		
		//페이징처리
		private int startNum; //시작페이지
		private int endNum; //마지막페이지
		private int pnum; //페이지넘버
		
		
		//시간 형태 변경
		public void setboardDate(java.sql.Timestamp boardDate) {
			SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm");
			this.boardDate = format.format(boardDate);
		}
		
		public void setupdatedDate(java.sql.Timestamp updateDate) {
			SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm");
			this.updateDate = format.format(updateDate);
		}
		
	
		
		
	
}
