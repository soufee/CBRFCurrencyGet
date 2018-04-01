public class BuildProps {

    public static void main(String[] args) {
//
//        oLog.infoForced("[BuildPropsListForTracking start]:: cpProperty = "+cpProperty+", cpPreviousProperty = "+cpPreviousProperty+", stepPage = "+stepPage);
////com.pegarules.generated.pega_rules_utilities.sendDebugMessageToTracer("[BuildPropsListForTracking start]","ReinsuranceFW");
//        PublicAPI tools = null;
//        PRThread  thisThread = (PRThread)ThreadContainer.get();
//        if (thisThread != null) {
//            tools = thisThread.getPublicAPI();
//        }
////----------
//        char cMode;
//        if(cpProperty != null){
//
//            cMode = cpProperty.getMode();
//        }else{
//
//            cMode = cpPreviousProperty.getMode();
//        }
//
//
//        if (cMode == ImmutablePropertyInfo.MODE_STRING_LIST || cMode == ImmutablePropertyInfo.MODE_STRING_GROUP){
//            oLog.infoForced("<====== cMode = " + cMode +" :: Зона 1");
//        }
//        else if(cMode == ImmutablePropertyInfo.MODE_PAGE_LIST || cMode==ImmutablePropertyInfo.MODE_PAGE_GROUP){
//            oLog.infoForced("<====== cMode = " + cMode +" :: Зона 2");
//            oLog.infoForced("[Mode PL/PG] "+cpProperty.getReference()+" "+cpPreviousProperty != null ? cpPreviousProperty.getReference() : "","ReinsuranceFW");
//            //     com.pegarules.generated.pega_rules_utilities.sendDebugMessageToTracer("[Mode PL/PG] "+cpProperty.getReference()+" "+cpPreviousProperty != null ? cpPreviousProperty.getReference() : "","ReinsuranceFW");
//            Iterator itPropsOnPage;
//            boolean bCurProp = true;
//            int prevSize = cpPreviousProperty != null ? cpPreviousProperty.size() : 0;
//            if (cpProperty.size()>=prevSize) {
//                itPropsOnPage = cpProperty.iterator();
//            } else {
//                itPropsOnPage = cpPreviousProperty.iterator();
//                bCurProp = false;
//            }
//            oLog.infoForced("[Cycle on bCurProp] "+bCurProp+ " "+cpProperty.size()+" "+prevSize,"ReinsuranceFW");
//            //   com.pegarules.generated.pega_rules_utilities.sendDebugMessageToTracer("[Cycle on bCurProp] "+bCurProp+ " "+cpProperty.size()+" "+prevSize,"ReinsuranceFW");
//            while (itPropsOnPage.hasNext())
//            {
//                ClipboardProperty pc = null;
//                ClipboardProperty pcPrev = null;
//                String ptName = "";
//
//                if (bCurProp) {
//                    pc = (ClipboardProperty)itPropsOnPage.next();
//                    if (cMode == ImmutablePropertyInfo.MODE_PAGE_LIST) {
//                        ptName = String.valueOf(pc.indexOf());
//                    } else {
//                        ptName = pc.getProperty("pxSubscript").getStringValue();
//                    }
//                    if (cpPreviousProperty != null) {
//                        pcPrev = cpPreviousProperty.getParentPage().getIfPresent(cpPreviousProperty.getName() + "(" + ptName + ")");
//                    }
//                    stepPage = pc.getPageValue();
//                } else {
//                    pcPrev = (ClipboardProperty)itPropsOnPage.next();
//                    if (cMode == ImmutablePropertyInfo.MODE_PAGE_LIST) {
//                        ptName = String.valueOf(pcPrev.indexOf());
//                    } else {
//                        ptName = pcPrev.getProperty("pxSubscript").getStringValue();
//                    }
//                    pc = cpProperty.getParentPage().getIfPresent(cpProperty.getName()+"(" + ptName + ")");
//                    stepPage = pcPrev.getPageValue();
//                }
//                try{
//                    com.pegarules.generated.reinsurancefw_reinsurance.BuildPropsListForTracking(pc,pcPrev,stepPage);
//                }
//                catch(NullPointerException e){
//                    oLog.infoForced("Упала рекурсия 1 c данными pc = "+pc+", pcPrev = "+pcPrev+", stepPage = "+stepPage);
//                    throw e;
//                }
//            }
//
//        }else if(cMode == ImmutablePropertyInfo.MODE_PAGE){
////-------------------------------------------------------------------------------------------------------------
//            oLog.infoForced("<====== cMode = " + cMode +" :: Зона 3");
//            // Open pyTrackSecurityChanges Data Transform if exists
//            ClipboardPage pgPage = null;
//            if (cpProperty != null) {
//                pgPage = cpProperty.getPageValue();
//            } else {
//                pgPage = cpPreviousProperty.getPageValue();
//            }
//            oLog.infoForced("[Mode Page] " + pgPage.getReference(),"ReinsuranceFW");
//            //  com.pegarules.generated.pega_rules_utilities.sendDebugMessageToTracer("[Mode Page] " + pgPage.getReference(),"ReinsuranceFW");
//            ClipboardPage dtPage = tools.createPage("Rule-Obj-Model","");
//            try
//            {
//                String oClassName = pgPage.getString(".pxObjClass");
//                // Handle pages without class definition. Just exit
//                if ("".equals(oClassName)) return;
//                dtPage.putString("pyClassName",oClassName);
//                dtPage.putString("pyModelName","pyTrackSecurityChanges");
//                ClipboardPage pgOpenResult = tools.getDatabase().open(dtPage, false);
//                if (pgOpenResult != null)
//                {
//                    java.util.Set setPropsOnPage = null;
//                    java.util.Set setPropsOnPrevPage = null;
//                    if (cpProperty != null){
//                        setPropsOnPage = pgPage.keySet();
//                    }
//                    if (cpPreviousProperty != null) {
//                        setPropsOnPrevPage = cpPreviousProperty.getPageValue().keySet();
//                    }
//
//                    Iterator itPropsOnDT = pgOpenResult.getIfPresent(".pyProperties").iterator();
//                    while (itPropsOnDT.hasNext())
//                    {
//                        ClipboardProperty dtCurProp = (ClipboardProperty)itPropsOnDT.next();
//                        String strPropName = dtCurProp.getProperty(".pyPropertiesName").getStringValue();
//                        String strSearchPropName = null;
//                        int tempDotIndex = strPropName.indexOf(".");
//                        if (tempDotIndex < 1){
//                            tempDotIndex = strPropName.indexOf(".",tempDotIndex+1);
//                        }
//
//                        if(tempDotIndex!=-1){
//                            strSearchPropName = strPropName.substring(0,tempDotIndex);
//                        }else{
//                            strSearchPropName = strPropName;
//                        }
//
//                        if (cpProperty!=null && setPropsOnPage.contains(strSearchPropName)) {
//                            ClipboardProperty curProp = pgPage.getProperty(cpProperty.getReference() + strPropName);
//                            ClipboardProperty prevProp = null;
//                            //  if (cpPreviousProperty!=null) {
//                            prevProp = cpPreviousProperty.getPageValue().getProperty(strPropName);
//                            // }
//                            oLog.infoForced("Add on cur prop "+strPropName);
//                            //   com.pegarules.generated.pega_rules_utilities.sendDebugMessageToTracer("Add on cur prop "+strPropName,"ReinsuranceFW");
//
//                            oLog.infoForced(" ================ curProp = '"+curProp + "'");
//                            oLog.infoForced(" ================ prevProp = '"+prevProp + "'");
//                            oLog.infoForced(" ================ (ClipboardPage)dtCurProp.getPageValue() = "+(ClipboardPage)dtCurProp.getPageValue());
//                            try{
//                                com.pegarules.generated.reinsurancefw_reinsurance.BuildPropsListForTracking(curProp,prevProp,(ClipboardPage)dtCurProp.getPageValue());
//                            }catch (NullPointerException e){
//                                oLog.infoForced("Ошибка рекурсии 2"+e+" при выполнении операции с данными curProp "+curProp+", prevProp = "+prevProp+", dtCurProp.getPageValue() = "+(ClipboardPage)dtCurProp.getPageValue());
//                                throw e;
//                            }
//                        }
//                        if (cpPreviousProperty!= null && (cpProperty==null || !setPropsOnPage.contains(strSearchPropName)) && setPropsOnPrevPage.contains(strSearchPropName)) {
//                            ClipboardProperty prevProp = cpPreviousProperty.getPageValue().getProperty(strPropName);
//                            oLog.infoForced("Add on prev prop "+strPropName,"ReinsuranceFW");
//                            //  com.pegarules.generated.pega_rules_utilities.sendDebugMessageToTracer("Add on prev prop "+strPropName,"ReinsuranceFW");
//                            try {
//                                com.pegarules.generated.reinsurancefw_reinsurance.BuildPropsListForTracking(null,prevProp,(ClipboardPage)dtCurProp.getPageValue());
//                            } catch (NullPointerException e){
//                                oLog.infoForced("Ошибка рекурсии 3"+e+" при выполнении операции с данными null , prevProp = "+prevProp+", (ClipboardPage)dtCurProp.getPageValue() = "+(ClipboardPage)dtCurProp.getPageValue());
//                                throw e;
//                            }
//                        }
//                    }
//                }
//            } catch(DatabaseException dbEx) {
//                // No rule found or something goes wrong ;)
//                // debug
//                oLog.infoForced("DatabaseException:"+dbEx.getMessage(),"ReinsuranceFW");
//                //     com.pegarules.generated.pega_rules_utilities.sendDebugMessageToTracer("DatabaseException:"+dbEx.getMessage(),"ReinsuranceFW");
//            }
//            dtPage.removeFromClipboard();
//        }
////---------------------------------------------------------------------------------------
//        else {
//// else assume scalar
//            oLog.infoForced("<====== cMode = " + cMode +" :: Зона 4");
//            oLog.infoForced("[Mode Scalar] ","ReinsuranceFW");
//            //     com.pegarules.generated.pega_rules_utilities.sendDebugMessageToTracer("[Mode Scalar] ","ReinsuranceFW");
//            ClipboardProperty cpScalarProp = cpProperty;
//            if (cpScalarProp == null && cpPreviousProperty!=null) {
//                cpScalarProp = cpPreviousProperty;
//            }
//            oLog.infoForced("========== cpScalarProp = "+cpScalarProp);
//
//            ClipboardPage pgScalar = stepPage;
//            oLog.infoForced("========== pgScalar = "+pgScalar);
//            ClipboardPage tmpPage = tools.findPage("ChangeTrackModelTmp");
//            int stepId = tmpPage.getProperty("pyProperties").size()+1;
//            String propFullPath = cpScalarProp.getReference().replace(cpScalarProp.getTopLevelPage().getName(),"").replace(".pyPreviousValues","");
//            oLog.infoForced("========== propFullPath = "+propFullPath);
//            String propLocalizedValue = "";
//            if (pgScalar==null) {
//                pgScalar = tools.createPage("Embed-ModelParams","");
//                pgScalar.getProperty("pyActionName").setValue("SET");
//                propLocalizedValue = cpScalarProp.getName();
//            } else {
//                propLocalizedValue = StringUtils.unquote(pgScalar.getString(".pyPropertiesValue"));
//            }
//            // Start search for localized value
//            String oPropLocalizedValue = propLocalizedValue;
//            oLog.infoForced("oPropLocalizedValue = "+oPropLocalizedValue);
//            tools.putParamValue("PropertyReference", PropertyInfo.TYPE_TEXT, "pyCaption");
//            tools.putParamValue("StringToLocalize", PropertyInfo.TYPE_TEXT, propLocalizedValue);
//
//            HashStringMap lparams = new HashStringMap();
//            lparams.putString("pxObjClass", "Rule-Obj-Activity");
//            lparams.putString("pyClassName", "@baseclass");
//            lparams.putString("pyActivityName", "GetLocalizedTextForString");
//            tools.doActivity(lparams, cpScalarProp.getParentPage(), null);
//
//            propLocalizedValue = tools.getParamValue("LocalizedString");
//
//            try
//            {
//                tools.applyModel(cpScalarProp.getParentPage(),tools.getParameterPage(),"GetTrackTitle");
//                String strTitle = tools.getParamValue("Title");
//                if (!"".equals(strTitle)) {
//                    propLocalizedValue = tools.getLocalizedTextForString("pyCaption",strTitle) + (char)0x2192 + propLocalizedValue;
//                }
//            } catch (Exception e) {
//                oLog.infoForced("Ошибка "+e);
//            }
//
//            pgScalar.getProperty("pyPropertyStepId").setValue(stepId);
//            pgScalar.getProperty("pyPropertiesName").setValue(propFullPath);
//            pgScalar.getProperty("pyPropertiesValue").setValue(propLocalizedValue);
//            tmpPage.getProperty("pyProperties").add(pgScalar);
//        }
//        oLog.infoForced("[BuildPropsListForTracking end]","ReinsuranceFW");
////com.pegarules.generated.pega_rules_utilities.sendDebugMessageToTracer("[BuildPropsListForTracking end]","ReinsuranceFW");

}
}