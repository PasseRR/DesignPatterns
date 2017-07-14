package passerr.github.io.creational.builder;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xiehai1
 * @date 2017/07/13 09:58
 * @Copyright(c) gome inc Gome Co.,LTD
 */
@Data
public class StudentVo implements Serializable {
    private String no;
    private String name;
    private String sex;
    private Integer age;

    public static StudentBuilder builder(){
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private String no;
        private String name;
        private String sex;
        private Integer age;

        public StudentBuilder no(String no){
            this.no = no;
            return this;
        }

        public StudentBuilder name(String name){
            this.name = name;
            return this;
        }

        public StudentBuilder sex(String sex){
            this.sex = sex;
            return this;
        }

        public StudentBuilder age(Integer age){
            this.age = age;
            return this;
        }

        public StudentVo build(){
            StudentVo studentVo = new StudentVo();
            studentVo.setName(this.name);
            studentVo.setSex(this.sex);
            studentVo.setAge(this.age);
            studentVo.setNo(this.no);

            return studentVo;
        }
    }
}
