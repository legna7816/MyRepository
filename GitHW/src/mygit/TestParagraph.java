package mygit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestParagraph {
	
	// 공백이 없는 경우
	@Test
	void noSpaceAndTap() {
		assertTrue(Paragraph.catWhiteSpace("ab").equals("ab"));
	}
	
	// 문자 사이 스페이스바 1번
	@Test
	void oneSpace() {
		assertTrue(Paragraph.catWhiteSpace("a b").equals("a b"));
	}

	// 문자열 사이 스페이스바 여러 번
	@Test
	void multiSpaces() {
		assertTrue(Paragraph.catWhiteSpace("a  b    c").equals("a b c"));
	}
	
	// 문자열 앞쪽에 스페이스 여러 번
    @Test
    void leadingSpaces() {
        assertTrue(Paragraph.catWhiteSpace("  a  b").equals(" a b"));
    }
    
    // 문자열 뒤쪽에 스페이스 여러 번
    @Test
    void trailingSpaces() {
        assertTrue(Paragraph.catWhiteSpace("a  b  ").equals("a b "));
    }
	
	// 문자열 앞뒤 스페이스바 여러 번
	@Test
	void spacesAround() {
		assertTrue(Paragraph.catWhiteSpace("  a  b  c  ").equals(" a b c "));
	}
	
	
	
	// 문자열 사이 tap 1번
	@Test
	void onetTap() {
		assertTrue(Paragraph.catWhiteSpace("a	b").equals("a b"));
	}
	
	// 문자열 사이 tap 여러 번
	@Test
	void multiTabs() {
		assertTrue(Paragraph.catWhiteSpace("a		b").equals("a b"));
	}
	
	// 문자열 앞쪽에 tap 여러 번
    @Test
    void leadingTaps() {
    	assertTrue(Paragraph.catWhiteSpace("		ab").equals(" ab"));
    }
    
    // 문자열 뒤쪽에 tap 여러 번
    @Test
    void trailingTaps() {
    	assertTrue(Paragraph.catWhiteSpace("ab		").equals("ab "));
    }
    
    // 문자열 뒤쪽에 tap 여러 번
    @Test
    void tapAround() {
    	assertTrue(Paragraph.catWhiteSpace("		a		b		").equals(" a b "));
    }
    
    
    
    // 스페이스와 탭이 1번 교차됨
  	@Test
  	void spaceAndTap() {
  		assertTrue(Paragraph.catWhiteSpace("a 	b").equals("a b"));
  	}
	
    // 스페이스와 탭이 2번 이상 교차됨
 	@Test
 	void spaceAndTapAlternating() {
 		assertTrue(Paragraph.catWhiteSpace("a 	 b	 	c").equals("a b c"));
 	}
	
 	// 스페이스 또는 탭으로만 구성
 	@Test
 	void onlySpaceOrTab() {
 		assertTrue(Paragraph.catWhiteSpace("	 ").equals(" "));
 	}
 	
 	
 	
 	
	// 입력이 빈 경우
	@Test
	void empty() {
		assertTrue(Paragraph.catWhiteSpace("").equals(""));
	}
	
	// null
	@Test
	void inputNull() {
		assertNull(Paragraph.catWhiteSpace(null));
	}

}
