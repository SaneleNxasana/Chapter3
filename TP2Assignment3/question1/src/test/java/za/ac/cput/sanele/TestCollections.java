package za.ac.cput.sanele;

import junit.framework.Assert;

/**
 * Created by Sanele Nxasana on 2016-03-12.
 */
public class TestCollections 
{
    @org.junit.Test
    public void test_List() throws Exception
    {
        Collections list = new CollectionsImp();
        Assert.assertEquals("Software Development", list.courses().get(0));
    }

    @org.junit.Test
    public void test_Set() throws Exception
    {
        Collections set = new CollectionsImp();
        Assert.assertEquals(3, set.students().size());
        Assert.assertTrue(set.students().contains("Clarke Kent"));
    }

    @org.junit.Test
    public void test_Map() throws Exception
    {
        Collections map = new CollectionsImp();

        Assert.assertEquals(3, map.subjects().size());
        Assert.assertTrue(map.subjects().containsKey("DOS300S"));
    }
}
