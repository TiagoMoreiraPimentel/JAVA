/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.manipulandodatas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * site de criar classe para costumizar data e hora:
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
 * @author Tiago
 */
public class ManipulandoDatas {

    public static void main(String[] args) {
        
        // instanciando uma data customizada.
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // instanciando uma data e hora customizada.
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        // instanciando data local.
        LocalDate d01 = LocalDate.now();
        // instanciando data e hora local.
        LocalDateTime d02 = LocalDateTime.now();
        // instanciando data e hora global com fuso-horario de londres.
        Instant d03 = Instant.now();
        // instanciando uma data convertida no formato iso-8601.
        LocalDate d04 = LocalDate.parse("2022-12-09");
        // instanciando uma data e hora convertida no formato iso-8601.
        LocalDateTime d05 = LocalDateTime.parse("2022-12-09T18:19:16");
        // instanciando uma data e hora global convertida no formato iso-8601.
        Instant d06 = Instant.parse("2022-12-09T18:19:16Z");
        // instanciando uma data e hora global convertida no formato iso-8601 com fuso horario de São paulo.
        Instant d07 = Instant.parse("2022-12-09T18:19:16-03:00");
        // instanciando uma data customizada.
        LocalDate d08 = LocalDate.parse("09/12/2022", fmt1);
        // instanciando uma data e hora customizada.
        LocalDateTime d09 = LocalDateTime.parse("09/12/2022 18:43", fmt2);
        // instanciando uma data ordenada isoladamente.
        LocalDate d10 = LocalDate.of(2022, 12, 9);
        // instanciando uma data e hora ordenada isoladamente.
        LocalDateTime d11 = LocalDateTime.of(2022, 12, 9, 18, 49);
        
        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
        System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());
        System.out.println("d10 = " + d10.toString());
        System.out.println("d11 = " + d11.toString());
    }
}
