package com.capbpm.drools.service;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleBindings;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.kie.internal.io.ResourceFactory;

import com.capbpm.drools.model.MedicationAdministrationOrder;

public class MainService {

	public static class SingletonHolder {
		public static final MainService HOLDER_INSTANCE = new MainService();
		static {
			HOLDER_INSTANCE.initKieContainer();
		}
	}
		
	public static MainService getInstance() {
		return SingletonHolder.HOLDER_INSTANCE;
	}

    private Map<String, KieContainer> containers = new HashMap<>();

    public MedicationAdministrationOrder calculate(MedicationAdministrationOrder activeMedicationOrder) {
		ScriptEngine js = new ScriptEngineManager().getEngineByName("javascript");
		
		Bindings bindings = new SimpleBindings();
		bindings.put("activeMedicationOrder", activeMedicationOrder);
		js.setBindings(bindings, ScriptContext.ENGINE_SCOPE);
		
		try {
			js.eval(
				new InputStreamReader(
					this.getClass().getClassLoader()
						.getResourceAsStream("Main/scripts/Initialization_d6ab51d9_fe78_450c_9ba5_d3c00de0ddc7.init.js"))
			);
			
			js.eval(
				new InputStreamReader(
					this.getClass().getClassLoader()
						.getResourceAsStream("Main/scripts/Initialization_d6ab51d9_fe78_450c_9ba5_d3c00de0ddc7.js"))
			);
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		
        return _e506f517_8d33_4893_bf73_5b79f0a95c6a(activeMedicationOrder);
    }

	private MedicationAdministrationOrder _e506f517_8d33_4893_bf73_5b79f0a95c6a(MedicationAdministrationOrder activeMedicationOrder) {
		if( isTrue("PatientExtender.hasProtocolOrderTrue(request.patient, OIDConceptCodeType._932c22d6_5868_286d_566c_c9cbaef89b2b, HealthcareOrderStatusType._2_16_840_1_113883_3_2390_2_2_190_1_DVA2)", new HashMap<>() {{put("activeMedicationOrder", activeMedicationOrder);}}) ){
			return Main_Initialization_55338c4e_e6a8_442c_bcfd_8b30b82b83ad(activeMedicationOrder);
		} else if( isTrue("", new HashMap<>() {{put("activeMedicationOrder", activeMedicationOrder);}}) ){
			return activeMedicationOrder;
		}
		return activeMedicationOrder;
	}
	private MedicationAdministrationOrder Main_Initialization_55338c4e_e6a8_442c_bcfd_8b30b82b83ad(MedicationAdministrationOrder activeMedicationOrder) {
        KieSession kieSession = containers.get("Main_Initialization_55338c4e_e6a8_442c_bcfd_8b30b82b83ad").newKieSession();
        FactHandle factHandle = kieSession.insert(activeMedicationOrder);
        kieSession.fireAllRules();
        kieSession.dispose();
        return Main_Eligibility_bbe06995_5c54_4ade_9713_ebd39a746ed3((MedicationAdministrationOrder)kieSession.getObject(factHandle));
	}
	private MedicationAdministrationOrder Main_Eligibility_bbe06995_5c54_4ade_9713_ebd39a746ed3(MedicationAdministrationOrder activeMedicationOrder) {
        KieSession kieSession = containers.get("Main_Eligibility_bbe06995_5c54_4ade_9713_ebd39a746ed3").newKieSession();
        FactHandle factHandle = kieSession.insert(activeMedicationOrder);
        kieSession.fireAllRules();
        kieSession.dispose();
        return Main_Orders_ce0ba550_7498_4503_ad72_065fe7294b21((MedicationAdministrationOrder)kieSession.getObject(factHandle));
	}
	private MedicationAdministrationOrder Main_Orders_ce0ba550_7498_4503_ad72_065fe7294b21(MedicationAdministrationOrder activeMedicationOrder) {
        KieSession kieSession = containers.get("Main_Orders_ce0ba550_7498_4503_ad72_065fe7294b21").newKieSession();
        FactHandle factHandle = kieSession.insert(activeMedicationOrder);
        kieSession.fireAllRules();
        kieSession.dispose();
        return Main_Patient_Status_9ec9c6ca_a0fb_4716_99d6_efdfe98298f0((MedicationAdministrationOrder)kieSession.getObject(factHandle));
	}
	private MedicationAdministrationOrder Main_Patient_Status_9ec9c6ca_a0fb_4716_99d6_efdfe98298f0(MedicationAdministrationOrder activeMedicationOrder) {
        KieSession kieSession = containers.get("Main_Patient_Status_9ec9c6ca_a0fb_4716_99d6_efdfe98298f0").newKieSession();
        FactHandle factHandle = kieSession.insert(activeMedicationOrder);
        kieSession.fireAllRules();
        kieSession.dispose();
        return Main_Final_Actions_0691b01b_85f7_4ad9_9810_2e58f1a173d7((MedicationAdministrationOrder)kieSession.getObject(factHandle));
	}
	private MedicationAdministrationOrder Main_Final_Actions_0691b01b_85f7_4ad9_9810_2e58f1a173d7(MedicationAdministrationOrder activeMedicationOrder) {
        KieSession kieSession = containers.get("Main_Final_Actions_0691b01b_85f7_4ad9_9810_2e58f1a173d7").newKieSession();
        FactHandle factHandle = kieSession.insert(activeMedicationOrder);
        kieSession.fireAllRules();
        kieSession.dispose();
        return (MedicationAdministrationOrder)kieSession.getObject(factHandle);
	}

    private void initKieContainer() {
		this.containers.put("Main_Initialization_55338c4e_e6a8_442c_bcfd_8b30b82b83ad", createContainer(new String[]{}));
		this.containers.put("Main_Eligibility_bbe06995_5c54_4ade_9713_ebd39a746ed3", createContainer(new String[]{}));
		this.containers.put("Main_Orders_ce0ba550_7498_4503_ad72_065fe7294b21", createContainer(new String[]{}));
		this.containers.put("Main_Patient_Status_9ec9c6ca_a0fb_4716_99d6_efdfe98298f0", createContainer(new String[]{}));
		this.containers.put("Main_Final_Actions_0691b01b_85f7_4ad9_9810_2e58f1a173d7", createContainer(new String[]{}));
	}
	
    private KieContainer createContainer(String[] drlFiles) {
		KieServices kieServices = KieServices.Factory.get();
		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		Arrays.asList(drlFiles)
			.stream()
				.map(ResourceFactory::newClassPathResource)
				.forEach(kieFileSystem::write);
		
		KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem);
		kieBuilder.buildAll();
		KieModule kieModule = kieBuilder.getKieModule();
		return kieServices.newKieContainer(kieModule.getReleaseId());
    }
    
    private Boolean isTrue(String javascript, Map<String, Object> input){
		ScriptEngine js = new ScriptEngineManager().getEngineByName("javascript");
		
		Bindings bindings = new SimpleBindings();
		bindings.putAll(input);
		js.setBindings(bindings, ScriptContext.ENGINE_SCOPE);
		
		try {
			Object rc = js.eval(javascript);
			if( rc != null ){
				return Boolean.valueOf(rc.toString());
			}
		} catch (ScriptException e) {
		}
        return Boolean.FALSE;
    }
}
