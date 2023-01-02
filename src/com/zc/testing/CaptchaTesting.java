package com.zc.testing;

import de.zerocode.Captcha;

public class CaptchaTesting {

	public static void main(String[] args) {
		Captcha random = new Captcha();
        System.out.println(random.genCaptcha(10,null));
        
	}

}
