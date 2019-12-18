package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.junit.experimental.theories.DataPoint;

import java.io.Serializable;
import java.util.Date;
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Emp implements Serializable {
    private int empno;
    private String ename;
    private String gender;
    private Date hiredate;
    private double salary;
    private double common;
    private int depyno;
}
