package edu.thu.icomponent;

import java.util.HashMap;

import edu.thu.bean.XmlResult;

public interface IDownloadComponent {

	void download(XmlResult xmlResult, HashMap<String, String> paramMap);

}
