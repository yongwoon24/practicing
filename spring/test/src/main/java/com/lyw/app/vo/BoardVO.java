package com.lyw.app.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardVO {
	int BOARD_NUM;
	String BOARD_NAME;
	String BOARD_PASS;
	String BOARD_SUBJECT;
	String BOARD_CONTENT;
	String BOARD_FILE;
	int BOARD_RE_REF;
	int BOARD_RE_LEV;
	int BOARD_RE_SEQ;
	int BOARD_READCOUNT;
	String BOARD_DATE;
}
