package multithreading;

public class SingleThreaded {
    public static void main(String[] args) {
        SingleThreaded sT = new SingleThreaded();
        sT.loopNumbers();
        System.out.println();
        for (int i = 1; i < 200 ; i++) {
            System.out.print("i: "+i+" ");
        }

    }
    void loopNumbers(){
        for (int j = 1; j < 200 ; j++) {
            System.out.print("j: "+j+" ");
        }
    }
}

/*
Main is the first thread created.
Here flow is in single thread. Each method has a different method space but execution is sequential.*/

/*
Output:
j: 1 j: 2 j: 3 j: 4 j: 5 j: 6 j: 7 j: 8 j: 9 j: 10 j: 11 j: 12 j: 13 j: 14 j: 15 j: 16 j: 17 j: 18 j: 19 j: 20 j: 21 j: 22 j: 23 j: 24 j: 25 j: 26 j: 27 j: 28 j: 29 j: 30 j: 31 j: 32 j: 33 j: 34 j: 35 j: 36 j: 37 j: 38 j: 39 j: 40 j: 41 j: 42 j: 43 j: 44 j: 45 j: 46 j: 47 j: 48 j: 49 j: 50 j: 51 j: 52 j: 53 j: 54 j: 55 j: 56 j: 57 j: 58 j: 59 j: 60 j: 61 j: 62 j: 63 j: 64 j: 65 j: 66 j: 67 j: 68 j: 69 j: 70 j: 71 j: 72 j: 73 j: 74 j: 75 j: 76 j: 77 j: 78 j: 79 j: 80 j: 81 j: 82 j: 83 j: 84 j: 85 j: 86 j: 87 j: 88 j: 89 j: 90 j: 91 j: 92 j: 93 j: 94 j: 95 j: 96 j: 97 j: 98 j: 99 j: 100 j: 101 j: 102 j: 103 j: 104 j: 105 j: 106 j: 107 j: 108 j: 109 j: 110 j: 111 j: 112 j: 113 j: 114 j: 115 j: 116 j: 117 j: 118 j: 119 j: 120 j: 121 j: 122 j: 123 j: 124 j: 125 j: 126 j: 127 j: 128 j: 129 j: 130 j: 131 j: 132 j: 133 j: 134 j: 135 j: 136 j: 137 j: 138 j: 139 j: 140 j: 141 j: 142 j: 143 j: 144 j: 145 j: 146 j: 147 j: 148 j: 149 j: 150 j: 151 j: 152 j: 153 j: 154 j: 155 j: 156 j: 157 j: 158 j: 159 j: 160 j: 161 j: 162 j: 163 j: 164 j: 165 j: 166 j: 167 j: 168 j: 169 j: 170 j: 171 j: 172 j: 173 j: 174 j: 175 j: 176 j: 177 j: 178 j: 179 j: 180 j: 181 j: 182 j: 183 j: 184 j: 185 j: 186 j: 187 j: 188 j: 189 j: 190 j: 191 j: 192 j: 193 j: 194 j: 195 j: 196 j: 197 j: 198 j: 199
i: 1 i: 2 i: 3 i: 4 i: 5 i: 6 i: 7 i: 8 i: 9 i: 10 i: 11 i: 12 i: 13 i: 14 i: 15 i: 16 i: 17 i: 18 i: 19 i: 20 i: 21 i: 22 i: 23 i: 24 i: 25 i: 26 i: 27 i: 28 i: 29 i: 30 i: 31 i: 32 i: 33 i: 34 i: 35 i: 36 i: 37 i: 38 i: 39 i: 40 i: 41 i: 42 i: 43 i: 44 i: 45 i: 46 i: 47 i: 48 i: 49 i: 50 i: 51 i: 52 i: 53 i: 54 i: 55 i: 56 i: 57 i: 58 i: 59 i: 60 i: 61 i: 62 i: 63 i: 64 i: 65 i: 66 i: 67 i: 68 i: 69 i: 70 i: 71 i: 72 i: 73 i: 74 i: 75 i: 76 i: 77 i: 78 i: 79 i: 80 i: 81 i: 82 i: 83 i: 84 i: 85 i: 86 i: 87 i: 88 i: 89 i: 90 i: 91 i: 92 i: 93 i: 94 i: 95 i: 96 i: 97 i: 98 i: 99 i: 100 i: 101 i: 102 i: 103 i: 104 i: 105 i: 106 i: 107 i: 108 i: 109 i: 110 i: 111 i: 112 i: 113 i: 114 i: 115 i: 116 i: 117 i: 118 i: 119 i: 120 i: 121 i: 122 i: 123 i: 124 i: 125 i: 126 i: 127 i: 128 i: 129 i: 130 i: 131 i: 132 i: 133 i: 134 i: 135 i: 136 i: 137 i: 138 i: 139 i: 140 i: 141 i: 142 i: 143 i: 144 i: 145 i: 146 i: 147 i: 148 i: 149 i: 150 i: 151 i: 152 i: 153 i: 154 i: 155 i: 156 i: 157 i: 158 i: 159 i: 160 i: 161 i: 162 i: 163 i: 164 i: 165 i: 166 i: 167 i: 168 i: 169 i: 170 i: 171 i: 172 i: 173 i: 174 i: 175 i: 176 i: 177 i: 178 i: 179 i: 180 i: 181 i: 182 i: 183 i: 184 i: 185 i: 186 i: 187 i: 188 i: 189 i: 190 i: 191 i: 192 i: 193 i: 194 i: 195 i: 196 i: 197 i: 198 i: 199
*/
