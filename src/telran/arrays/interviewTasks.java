package telran.arrays;

public class interviewTasks {
static public boolean isSumTwo(short[] array, short sum) {

	boolean res = false;
	for(int i = 0; i< array.length; i++) {
		short num = (short)(sum - array[i]);
		int y = 0;
		while (y<array.length && !res) {
			if(array[y]==num && y!=i) {
				res = true;
			}
			y++;
		}
		i++;
	}
	return res;
	
	
}
static public boolean isSumTwo1(short[] array, short sum) {
//array of positive numbers or 0 
boolean[] helper = new boolean [sum > 0 ? sum + 1 : Short.MAX_VALUE +1]; 
boolean res = false;
int index = 0;
while(index < array.length && !res){
	short num = (short)(sum-array[index]);
	if(num>=0) {
		if(helper[num]) {
			res = true;
		}else {
			helper[array[index]]= true;
		}
	}
	index ++;
}
return res;
}
public static void sort(short[]array)
{
	short[] helper = new short [Short.MAX_VALUE];
	for (short i = 0; i < array.length; i++) {
		helper[array[i]]++;
	}
	short index = 0;
	for (short x = 0; x < helper.length; x++) {
		for (short y = 0; y < helper[x]; y++) {
			array[index++] = (short) x;
		}
	}
}
	

public static short getMaxWithNegativePresentation(short[] array) {
	short [] helper = new short [array.length];
	short temp = 0;
	for (int x = 0; x < array.length; x++)
	{
		temp = array[x];
		for (int y = 0; y < array.length; y++)
		{
			if (-temp==array[y]){
				helper[y] = array[x];
				}
			}
	}
	short maxNumber = helper[0];
	for (int x = 0; x < helper.length; x++) 
	{
		        if (helper[x] > maxNumber){
		            maxNumber = helper[x];
		        }
	}	        
    return maxNumber>0?maxNumber:-1;
}

}
