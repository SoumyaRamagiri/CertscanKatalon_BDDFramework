package image

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class ImageAllViewsLoaded {
	@Keyword
	def waitUntilImageIsloaded(){
		boolean flag=false
		while(!flag)
			flag=WebUI.executeJavaScript("return dicos.attrs.allViewsLoaded", null)
		return flag
	}
}
