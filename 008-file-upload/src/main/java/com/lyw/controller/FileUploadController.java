package com.lyw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

@Controller
public class FileUploadController {

  @PostMapping("/upload")
  @ResponseBody
  public String upload(
          @RequestParam("username") String username,
          @RequestPart("headers") MultipartFile headers
          ) throws IOException {
    String fileName = headers.getOriginalFilename();
    String contentType = headers.getContentType();
    System.out.println(contentType + " <-> " + username);
    headers.transferTo(new File("/Users/liyawei/idea_workspace/springboot_workspace/雷丰阳springboot2及源码/review_workspace/008-file-upload/src/main/resources/img/headers/" + fileName));

    return "文件名 = " + fileName + "， 文件大小 = " + headers.getSize();
  }
}
