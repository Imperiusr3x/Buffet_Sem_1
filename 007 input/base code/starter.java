import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely.");
main()		
{	
		srand(time(NULL));
	int g;
	int h;
	char sym;
	int m;
	
	cout<<"What character would you like to use: ";
	cin>>sym;
	cout<<"How many do you want to appear: ";
	cin>>g;
	cout<<"What's the x-coordinate you want: ";
	cin>>h;
	cout<<"Whats the y-coordinate you want: ";
	cin>>m;
	gotoxy(0+h,3+m);
	for(int j = 0;j<g;j++)
	{
	cout<<sym;
	}
	
		getch();
}

	
	

