package com.smartdatasolutions.test.impl;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.smartdatasolutions.test.Member;
import com.smartdatasolutions.test.MemberExporter;
import com.smartdatasolutions.test.MemberFileConverter;
import com.smartdatasolutions.test.MemberImporter;

public class Main extends MemberFileConverter {

	@Override
	    protected MemberExporter getMemberExporter() {
	        return new MemberExporterImpl();
	    }

	    @Override
	    protected MemberImporter getMemberImporter() {
	        return new MemberImporterImpl();
	    }


	@Override
	    protected List<Member> getNonDuplicateMembers(List<Member> membersFromFile) {
	   
	        return membersFromFile.stream().distinct().collect(Collectors.toList());
	    }

	    @Override
	    protected Map<String, List<Member>> splitMembersByState(List<Member> validMembers) {
	        return validMembers.stream()
	                .collect(Collectors.groupingBy(Member::getState));
	    }


	public static void main( String[] args ) {
		try {
	             Main main = new Main();
	             File inpMemFil = new File(".\\Members.txt");
	             String outFilepath = "output";
	             String outFile = "outputFile.csv";

	             File outputDirectory = new File("output");
	             if (!outputDirectory.exists()) {
	                 outputDirectory.mkdirs();
	             }
	             
	             main.processMemberFile(inpMemFil, outFilepath, outFile);

	             System.out.println("generated file ->  " + outFilepath);
	         } catch (Exception e) {
	             handleException(e);
	         }
	     }

	     private void processMemberFile(File inpMemFil, String outFilepath, String outFile) throws Exception {
	         MemberFileConverter memberFileConverter = new Main();
	         memberFileConverter.convert(inpMemFil, outFilepath, outFile);
	     }

	     private static void handleException(Exception e) {
	         e.printStackTrace();
	       
	     
	    }

}
