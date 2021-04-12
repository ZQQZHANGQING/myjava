package threadtest;
public class xinyue{

}

/*
#include <iostream>
#include <stdio.h>
#include<vector>
#include<stdlib.h>
#include<map>
#include<set>
#include<algorithm>
#include<string>
#include<numeric>
using namespace std;
int main{
        string str;
        cin>>str;
        string target;
        cin>>target;

        int len=str.size();
        str=str+str;
        int cnt1=0,cnt2=0;
        int i=start;
        int j=0;
        if(target[j]==str[i%len])cnt1--;
        while(i<2*len&&j<target.size()){
        if(target[j]==str[i%len]){
        i++;
        j++;
        cnt1++;
        }else{
        i++;

        cnt1++;
        }
        }
        i = start + len;
        j = target.size();
        if(target[j]==str[i%len])cnt2--;
        while(i>=0&&j>=0){
        if(target[j]==str[i%len]){
        i--;
        j--;
        cnt2++;
        }else{
        j--;

        cnt2++;
        }
        }
        int res = min(cnt1,cnt2);
        cout<<res<<endl;
        return 0;
}
*/