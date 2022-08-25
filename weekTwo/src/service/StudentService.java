package service;

import java.util.List;

import models.Student;
import repository.Crudrepository;

public class StudentService implements Crudrepository<Student> {

    @Override
    public List<Student> findAll() {
        List<Student> studentList =  em.createQuery("FROM Student",Student.class).getResultList();
        return studentList;
    }

    @Override
    public Student findById(int id) {
        return em.find(Student.class,id);
    }

    @Override
    public void saveToDatabase(Student student) {
        try {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }finally {

        }
    }

    @Override
    public void deleteFromDatabase(Student student) {
        try {
            em.getTransaction().begin();

            em.remove(student);
            System.out.println("a student "+ "has deleted");
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }finally {

        }
    }

    @Override
    public void deleteFromDatabaseById(int id) {
        try {
            em.getTransaction().begin();

           /* Student foundStudent =  findById(id);
            em.remove(foundStudent);*/

            Student foundStudent =  em.createQuery("FROM Student s WHERE s.id=:Stu_id",Student.class)
                    .setParameter("Stu_id",id)
                    .getSingleResult();   // getSingleResult() returns only one result, so we must be careful about that !
            em.remove(foundStudent);

            System.out.println("a student "+ "has deleted");
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }finally {

        }
    }

    @Override
    public void updateOnDatabase(Student student) {
        try {
            em.getTransaction().begin();

            em.merge(student);

            System.out.println("a student "+ "has deleted");
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }finally {

        }
    }
}
