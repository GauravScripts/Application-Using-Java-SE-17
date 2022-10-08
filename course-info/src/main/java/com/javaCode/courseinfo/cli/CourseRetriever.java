package com.javaCode.courseinfo.cli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CourseRetriever {
    private static  final Logger LOG= LoggerFactory.getLogger(CourseRetriever.class);
    public static void main(String... args) {
        LOG.info("CourseReteriver Started");
        if(args.length==0){
            LOG.warn("Please provide author name");
            return;
        }
        try {
            retrieveCourses(args[0]);
        }catch(Exception e){
            LOG.warn("Unexpexted Error",e);
        }
    }


    private static void retrieveCourses(String authorID) {
        LOG.info("Reteriving courses for author '{}'"+authorID);
    }
}
