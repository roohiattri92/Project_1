package Assignment_on_selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Absolutexpath_1 {

	public static void main(String[] args) 
	{
		//*EdgeDriver p1=new EdgeDriver();
//p1.get("https://mail-attachment.googleusercontent.com/attachment/u/0/?ui=2&ik=b4d569b785&attid=0.1&permmsgid=msg-f:1796548251716143818&th=18ee9f1dcd63caca&view=att&disp=inline&realattid=f_ls7tpa4n0&ser=1&saddbat=ANGjdJ_BOw3lNqMLuswDnjoKwfij2TqNtWn61m05-na2DPjRXI1AQIMTFtG4waqWn-T2gliueybuZGBh6kYRtqrpWFBczR29LwnbYYWXHl-j0DfOe49m1SXJf6k3sCPtnJZ5Qbuf35amTBPloDHyFV6vrVNU3M9y37VJxsTxyPFJWkG_dR0mTMW9aSF3QfXRcxTqjoFEkw26PoO_FZGry6I94I3Xons43Z9op7HjvlG2MfVa8QA02aMddiMuyh2A-g5nICqFKqoQrWgnrOe-Ue3jQ99KVo2xoJ-dX8CAwmucoToi3vpIN4DBeJehsgtSAlXqnsGy-sIV8nvAXW8juFMZg6lq6NHzw2wb0-NI1A7vLMlYGRgkeAFQqEe79Oe37In0cNm39ObgZSkoZ8snaLuUQnMI1Egl84jubdzOeHjHtRh2sGkvU_Tk_hr26xtK8OuNgkSM9NTAFm1UXheLajfScz0dUHEftSmEM0Yeg8V1Atkav4L_xGe2AcgYbvtZpjjl7TAR1w8FfF5f3G4sa3x0aHlNvyUFRvnZn7k_T77FLIgVRp_Ql_ya6uQDcCuI2xsA8slguDHh8VlEvIPnedmc7qSBHpkgV8Y78jKkWySUwRQaCBN5TTSMklkgcPPv91n3qECETXngy_qY4MGUVIqGxGg9pJVt8NYbpvHdJRUYqFxh1pL6sz37gcA-cc54BLF_U4DBHOEg3nhvJxpLMJ-4Mb2F7T8WSKav3sLJkmbDVn87Ya-ZL8Wv-3soNtJrEBgMAwOFoxU1BoiNN7QGNaaT_jNVV9YGUdxLQY1IKA29dL59V65nr7ZznxRFMrFoQrBbX7b2xfW_Ar5_OIrKa4oV57gyfPoPhi-bixFNMM5N04A1dK58jBgNtmwZMCMQUUjag6KCic8l-3cFKsTh8mixiI8Z2gtkhgMmCbSq0XyP9EPYB1WgNqibz4kaAsjgHqlLt9u
ChromeDriver o1=new ChromeDriver();
//o1.get("https://www.amazon.in/");
o1.get("file:///C:/Users/roohi/Downloads/learningHTML1.html");
o1.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("roohikohli92@gmail.com");
	o1.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("roohi@786");
	o1.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("yes");
	o1.findElement(By.xpath("(/html/body/form)[1]/input[1]")).sendKeys("roohi");
	o1.findElement(By.xpath("(/html/body/form)[2]/input[2]")).click();
	o1.findElement(By.xpath("/html/body/input[5]")).click();
	o1.findElement(By.xpath("/html/body/input[6]")).click();
WebElement jaa=	o1.findElement(By.xpath("(/html/body/select)[1]"));
jaa.click();
Select e1=new Select(jaa);
e1.selectByIndex(1);
jaa.sendKeys(Keys.ENTER);
	}

}
