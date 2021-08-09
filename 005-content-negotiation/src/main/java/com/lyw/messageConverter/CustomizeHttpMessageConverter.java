package com.lyw.messageConverter;

import com.lyw.entity.Student;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public class CustomizeHttpMessageConverter implements HttpMessageConverter<Student> {

  /***
   * 决定着你能不能读
   * @param clazz 对应的范型类型
   * @param mediaType 媒体类型
   * @return false
   */
  @Override
  public boolean canRead(Class<?> clazz, MediaType mediaType) {
    return false;
  }

  /***
   * 能不能写，这里主要是完成这个功能
   * @param clazz 对应的范型类型
   * @param mediaType 媒体类型
   * @return 是否是 Student 类型
   */
  @Override
  public boolean canWrite(Class<?> clazz, MediaType mediaType) {
    return clazz.isAssignableFrom(Student.class);
  }

  /***
   * 获取当前的消息转换器支持的类型
   * @return 支持的媒体类型
   * 扩招的类型一般是 x-** 'x'开头
   */
  @Override
  public List<MediaType> getSupportedMediaTypes() {
    return MediaType.parseMediaTypes("application/x-yawei");
  }

  /***
   * 这里关闭了读功能
   */
  @Override
  public Student read(Class<? extends Student> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
    return null;
  }

  /**
   * 输出的样式
   * @param student 拿到的数据
   * @param contentType 响应的数据内容类型
   * @param outputMessage 输出流
   * @throws IOException IO 的异常
   * @throws HttpMessageNotWritableException 不能写的异常
   */
  @Override
  public void write(Student student, MediaType contentType, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
    String data = student.getId() + ";" + student.getStuName() + ";" + student.getStuAge() + ";"
            + student.getStuAddr();
    OutputStream body = outputMessage.getBody();
    body.write(data.getBytes());
    body.flush();
    body.close();
  }
}
