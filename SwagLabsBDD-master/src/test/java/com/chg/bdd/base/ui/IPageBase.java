package com.chg.bdd.base.ui;




import static com.chg.bdd.utilities.datamanagers.XmlReader.getData;

import org.dom4j.Document;

import com.chg.bdd.utilities.datamanagers.XmlReader;

public interface IPageBase {
	Document document = XmlReader.getData("/src/test/resources/locators/locators.xml");
	//Document document =getData("/src/test/resources/locators/locators.xml");
}
