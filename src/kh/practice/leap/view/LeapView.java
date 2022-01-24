package kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	private LeapController ctrl = new LeapController();
	public LeapView() {
		//2019년은 평년입니다.
		//총 날짜 수 : 737164
		Calendar cal = Calendar.getInstance();	//Calendar에서 날짜 가져올때는 getInstance()를 쓴다. = singleton pattern 싱글톤패턴
												//왜냐, calendar의 크기가 큼. new해서 heap에 큰 calendar를 가져올 필요가 없으므로.(메모리 낭비)
		System.out.println(cal.getTime());
		
	}
}
