package za.ac.cput.sanele;

import java.util.*;
/**
 * Created by Sanele Nxasana on 2016/03/12.
 */
public class CollectionsImp implements Collections
{
    public CollectionsImp()
    {
        super();
    }

    public List<String> courses()
    {
        List courses = new ArrayList();
        courses.add("Software Development");
        courses.add("Communication Networks");
        courses.add("Business Analysis");
        return courses;
    }

    public Set<String> students()
    {
        Set students = new HashSet();
        students.add("Clarke Kent");
        students.add("Peter Parker");
        students .add("Bruce Wayne");
        return students;
    }

    public Map<String, String> subjects()
    {
        Map subjects = new HashMap();
        subjects.put("DOS300S", "Development Software 3");
        subjects.put("IRP300S", "Internet Programming 3");
        subjects.put("TPG200S", "Technical Programming 2");
        return subjects;
    }
}
