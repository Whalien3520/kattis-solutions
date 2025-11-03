#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);cin.tie(0);cout.tie(0);
    
    int r, c, n;
    cin >> r >> c >> n;
    queue<int> q;
    for(int i = 1; i <= n; i++) {
        int rr, cc;
        cin >> rr >> cc;
        q.push(i);
        q.push(rr - 1);
        q.push(cc - 1);
    }
    
    vector<vector<int>> f(r, vector<int>(c, 0)), s(r, vector<int>(c, 0)), moves = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    while(q.size()) {
        int i = q.front(), rr, cc;
        q.pop();
        rr = q.front();
        q.pop();
        cc = q.front();
        q.pop();
        if(s[rr][cc] || f[rr][cc] == i)
            continue;
        if(!f[rr][cc])
            f[rr][cc] = i;
        else if(f[rr][cc] != i)
            s[rr][cc] = i;
        for(const auto& move : moves)
            if(0 <= rr + move[0] && rr + move[0] < r && 0 <= cc + move[1] && cc + move[1] < c) {
                q.push(i);
                q.push(rr + move[0]);
                q.push(cc + move[1]);
            }
    }
    
    for(const auto& rr : f) {
        for(const auto& cc : rr)
            cout << cc << " ";
        cout << endl;
    }
    for(const auto& rr : s) {
        for(const auto& cc : rr)
            cout << cc << " ";
        cout << endl;
    }

    return 0;
}