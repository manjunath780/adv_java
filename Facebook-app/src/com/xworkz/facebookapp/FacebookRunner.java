package com.xworkz.facebookapp;

import com.xworkz.facebookapp.constants.Gender;
import com.xworkz.facebookapp.exception.*;
import com.xworkz.facebookapp.facebookdto.FacebookDto;
import com.xworkz.facebookapp.generatefacebook.Facebook;

import java.util.Scanner;

public class FacebookRunner {

    public static void main(String[] args) {


        FacebookDto facebookDto = new FacebookDto();
        facebookDto.setId(1);
        facebookDto.setFirstName("baba");
        facebookDto.setLastName("b s");
        facebookDto.setDob("8/04/2000");
        facebookDto.setGender(Gender.Male);
        facebookDto.setEmail("baba@gmail.com");
        facebookDto.setMobile("9996589999");
        facebookDto.setUserName("baba");
        facebookDto.setPassword("baba@123");

        Facebook facebook = new Facebook();
        facebook.newAccount(facebookDto);


        Scanner in = new Scanner(System.in);
        System.out.println("enter the facebook user id for get username");
        int id = in.nextInt();
        String name = getUserNameById(id);
        System.out.println(name);

        System.out.println("enter the facebook user id for get user Dob");
        int idForDob = in.nextInt();
        String dob = getUserDobById(idForDob);
        System.out.println(dob);

        System.out.println("enter the facebook user id for get user Email");
        int idForEmail = in.nextInt();
        String email = getUserEmailById(idForEmail);
        System.out.println(email);

        System.out.println("enter the facebook user id for get user phone number");
        int idForphNum = in.nextInt();
        String phNumber = getUserPhNumberById(idForphNum);
        System.out.println(phNumber);

        System.out.println("enter the facebook user id for get user gender");
        int idForgender = in.nextInt();
        Gender gender = getUserGenderById(idForgender);
        System.out.println(gender);

    }
    public static String getUserNameById(int id){
        String name = null;
       FacebookDto dto = new FacebookDto();
       dto.setId(1);
       dto.setUserName("JohnCena");

       try {
           if (id == dto.getId()) return name = dto.getUserName();
           else throw new UserNameByIdException("user name not found");
       }catch (UserNameByIdException ref){
           ref.printStackTrace();
       }
        return name;
    }
    public  static  String getUserDobById(int id){
        String dob = null;
        FacebookDto dto = new FacebookDto();
        dto.setId(1);
        dto.setDob("08/04/2000");

        try {
            if (id == dto.getId()) return dob = dto.getDob();
            else throw new UserDobByIdException("user dob not found");
        }catch (UserDobByIdException ref){
            ref.printStackTrace();
        }
        return dob;
    }
    public  static  String getUserEmailById(int id){
        String email = null;
        FacebookDto dto = new FacebookDto();
        dto.setId(1);
        dto.setEmail("john123@gmail.com");

        try {
            if (id == dto.getId()) return email = dto.getEmail();
            else throw new UserEmailByIdException("user dob not found");
        }catch (UserEmailByIdException ref){
            ref.printStackTrace();
        }
        return email;
    }
    public  static  String getUserPhNumberById(int id){
        String phNumber = null;
        FacebookDto dto = new FacebookDto();
        dto.setId(1);
        dto.setMobile("9876543210");

        try {
            if (id == dto.getId()) return phNumber = dto.getMobile();
            else throw new UserPhNumberByIdException("user dob not found");
        }catch (UserPhNumberByIdException ref){
            ref.printStackTrace();
        }
        return phNumber;
    }
    public  static  Gender getUserGenderById(int id){
        Gender gender = null;
        FacebookDto dto = new FacebookDto();
        dto.setId(1);
        dto.setGender(Gender.Male);

        try {
            if (id == dto.getId()) return gender = dto.getGender();
            else throw new UserGenderByIdException("user dob not found");
        }catch (UserGenderByIdException ref){
            ref.printStackTrace();
        }
        return gender;
    }


}
