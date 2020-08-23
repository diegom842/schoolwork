package APT2;

public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize)
    {

        long diskSpace = 0; //total space taken up

        for(int i = 0; i < sizes.length; i++)
        {
            diskSpace += getActualSpace(sizes[i], clusterSize); //accumulated disk space
        }

        return diskSpace;
    }

    public int getActualSpace(int size, int clusterSize)
    {
        if (size == 0)
            return 0; //no disk space
        if (size <= clusterSize)
            return clusterSize; //if it's under, then it's simply the cluster size

        if(size % clusterSize == 0)
            return size;


        //if(size > clusterSize)
        int clusters = size/clusterSize; //how many times size fills a cluster


        return (clusters * clusterSize) + clusterSize;

    }
}