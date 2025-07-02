package com.xworkz.institution;

import com.xworkz.institution.dto.TrainerDto;
import com.xworkz.institution.exception.TrainerAddressByIdException;
import com.xworkz.institution.exception.TrainerNameByIdException;
import com.xworkz.institution.exception.TrainerAgeByIdException;

public class Runner {

    public static void main(String[] args) {
        String name = getTrainerNameById(1);
        System.out.println(name);


        int age = getTrainerAgeById(5);
        System.out.println(age);

        String address = getTrainerAddressById(5);
        System.out.println(address);
    }

    public static String getTrainerNameById(int id) throws TrainerAgeByIdException {
        String trainerName = null;
       TrainerDto dto = new TrainerDto();
       dto.setId(1);
       dto.setName("manjunath");
       dto.setAge(23);
       dto.setAddress("bangalore");

       try{if(dto.getId() == id){
           trainerName = dto.getName();
       }else{ throw new TrainerNameByIdException("not found that trainer's name by you enterd id");
       }}catch (TrainerAgeByIdException e){
           e.printStackTrace();
       }

        return trainerName;
    }
    public static int getTrainerAgeById(int id) throws TrainerAgeByIdException {
        int age = 0;

        TrainerDto dto = new TrainerDto();
        dto.setId(1);
        dto.setName("manjunath");
        dto.setAge(23);
        dto.setAddress("bangalore");

        try {
            if (dto.getId() == id && id == 0) {
                age = dto.getAge();
            } else throw new TrainerAgeByIdException("not found that trainer's age by you enterd id");
        }catch (TrainerAgeByIdException e){
            e.printStackTrace();
        }
        return age;
    }

    public static String getTrainerAddressById(int id){
        String traineraddress = null;

        TrainerDto dto = new TrainerDto();
        dto.setId(1);
        dto.setName("manjunath");
        dto.setAge(23);
        dto.setAddress("bangalore");

        if(dto.getId() == id){
            return traineraddress = dto.getAddress();
        }else throw new TrainerAddressByIdException("not found that trainer's address by you enterd id");

    }


}
