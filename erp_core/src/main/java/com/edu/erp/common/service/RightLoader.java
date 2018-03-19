package com.edu.erp.common.service;

import com.edu.erp.utils.RightUtils;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Scope;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

@Service("rightLoader")
@Scope("singleton")
public class RightLoader implements ApplicationListener<ContextRefreshedEvent> {
    private static final Logger log = Logger.getLogger(RightLoader.class);

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if (log.isDebugEnabled()) {
            log.debug("begin to read right.");
        }

        URL jsonFile = jsonFile = RightLoader.class
                .getResource("/plugins/right/menus.json");
        if (jsonFile == null || StringUtils.isEmpty(jsonFile.getFile())) {
            log.error("menus.json is not found.");
            return;
        }

        File file = null;
        try {
            file = new File(jsonFile.toURI());
        } catch (URISyntaxException e1) {
            e1.printStackTrace();
            log.error("error found ,see:", e1);
            return;
        }

        if (file.exists() && file.canRead()) {
            Scanner scanner = null;
            StringBuilder buffer = new StringBuilder();
            try {

                scanner = new Scanner(file, "utf-8");
                while (scanner.hasNextLine()) {
                    buffer.append(scanner.nextLine());
                }
                JSONObject jsonObject = JSONObject
                        .fromObject(buffer.toString());
                RightUtils.getInstance().loadRightModel(jsonObject);
                log.debug("read right,see:"
                        + RightUtils.getInstance().getRoot());
            } catch (FileNotFoundException e) {
                log.error("error found ,see:", e);
            } finally {
                if (scanner != null) {
                    scanner.close();
                }
            }
        }

        if (log.isDebugEnabled()) {
            log.debug("end to read right.");
        }
    }
}
