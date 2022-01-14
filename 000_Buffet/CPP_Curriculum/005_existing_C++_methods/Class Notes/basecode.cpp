// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	gotoxy(6,6);
	cout << '@';
	gotoxy(6,6 + 1);
	cout << 'N';
	gotoxy(6,6 + 2);
	cout << 'D';
	gotoxy(6,6 + 3);
	cout << 'R';
	gotoxy(6,6 + 4);
	cout << 'E';
	gotoxy(6,6 + 5);
	cout << 'W';
	
	for(int i = 0; i < 6; i++){
		gotoxy(6,6 + i);
		cout << 'N';
	}
}
