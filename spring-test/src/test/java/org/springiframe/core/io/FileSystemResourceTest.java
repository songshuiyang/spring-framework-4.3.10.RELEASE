package org.springiframe.core.io;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.core.io.FileSystemResource;

import java.io.File;

/**
 * @author songshuiyang
 * @date 2019/6/9 11:05
 */
@Slf4j
public class FileSystemResourceTest {

    @Test
    public void createByFile() throws Exception {
        File file = new File("D://1.txt");
        FileSystemResource fileSystemResource = new FileSystemResource(file);
        log.info(fileSystemResource.getURL().toString());
    }

    @Test
    public void createByPath() throws Exception {
        FileSystemResource fileSystemResource = new FileSystemResource("D://1.txt");

    }
}
