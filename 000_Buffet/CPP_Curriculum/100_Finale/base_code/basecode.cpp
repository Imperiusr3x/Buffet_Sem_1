// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"yeah we are starting c++"<<endl;

cout <<"      *"<< endl;
cout <<"     ***"<< endl;
cout <<"    *****"<< endl;
cout <<"   ********       **** "<< endl;
cout <<"  **********     ******"<< endl;
cout <<"     ----         **** "<< endl;
cout <<"     ----"<< endl;
cout <<"     ----"<< endl;

for(int i=0; i<8; i++){
			gotoxy(1,2+i);
			cout<<' '<<endl;
			cout<<'*'<<endl;
			sleep(1);


		}
}