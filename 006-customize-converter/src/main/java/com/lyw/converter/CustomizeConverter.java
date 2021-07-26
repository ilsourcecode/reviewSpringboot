package com.lyw.converter;

import com.lyw.entity.Pet;
import org.springframework.core.convert.converter.Converter;

public class CustomizeConverter implements Converter<String, Pet> {

  @Override
  public Pet convert(String source) {
    String[] split = source.split(",");
    Pet pet = new Pet(split[0], Integer.valueOf(split[1]));
    return pet;
  }
}
