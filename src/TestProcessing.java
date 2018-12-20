/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayla
 */
public class TestProcessing {
    
    public static void main(String[] args)
    {
        JobProcessing j = new JobProcessing();
        
        j.print(j.FIFO());
        System.out.print("FIFO Average Time: ");
        j.average(j.FIFO());
        System.out.println();
        j.print(j.SJF());
        System.out.print("SJF Average Time: ");
        j.average(j.SJF());
        System.out.println();        
        j.print(j.RR());
        System.out.print("RR Average Time: ");
        j.average(j.RR());
    }
}

/*OUTPUT

run:
73 31 91 53 90 78 78 34 1 84 77 73 8 61 52 42 9 68 69 23 55 11 88 69 76 72 17 23 73 22 48 33 26 53 7 37 17 9 57 93 64 67 84 40 30 16 96 79 12 57 41 28 5 33 8 9 8 20 66 75 71 13 91 45 67 21 71 70 59 86 60 93 27 94 72 82 42 14 97 59 24 68 67 38 34 55 28 2 63 12 51 25 9 4 88 58 88 55 59 29 
0 73 104 195 248 338 416 494 528 529 613 690 763 771 832 884 926 935 1003 1072 1095 1150 1161 1249 1318 1394 1466 1483 1506 1579 1601 1649 1682 1708 1761 1768 1805 1822 1831 1888 1981 2045 2112 2196 2236 2266 2282 2378 2457 2469 2526 2567 2595 2600 2633 2641 2650 2658 2678 2744 2819 2890 2903 2994 3039 3106 3127 3198 3268 3327 3413 3473 3566 3593 3687 3759 3841 3883 3897 3994 4053 4077 4145 4212 4250 4284 4339 4367 4369 4432 4444 4495 4520 4529 4533 4621 4679 4767 4822 4881 
FIFO Average Time: 2476.4

73 31 91 53 90 78 78 34 1 84 77 73 8 61 52 42 9 68 69 23 55 11 88 69 76 72 17 23 73 22 48 33 26 53 7 37 17 9 57 93 64 67 84 40 30 16 96 79 12 57 41 28 5 33 8 9 8 20 66 75 71 13 91 45 67 21 71 70 59 86 60 93 27 94 72 82 42 14 97 59 24 68 67 38 34 55 28 2 63 12 51 25 9 4 88 58 88 55 59 29 
0 1 3 7 12 19 27 35 43 52 61 70 79 90 102 114 127 141 157 174 191 211 232 254 277 300 324 349 375 402 430 458 487 517 548 581 614 648 682 719 757 797 838 880 922 967 1015 1066 1118 1171 1224 1279 1334 1389 1446 1503 1561 1620 1679 1738 1798 1859 1922 1986 2052 2119 2186 2253 2321 2389 2458 2527 2597 2668 2739 2811 2883 2956 3029 3102 3177 3253 3330 3408 3486 3565 3647 3731 3815 3901 3989 4077 4165 4255 4346 4437 4530 4623 4717 4813 
SJF Average Time: 1621.37

// for increment of 20 units
73 31 91 53 90 78 78 34 1 84 77 73 8 61 52 42 9 68 69 23 55 11 88 69 76 72 17 23 73 22 48 33 26 53 7 37 17 9 57 93 64 67 84 40 30 16 96 79 12 57 41 28 5 33 8 9 8 20 66 75 71 13 91 45 67 21 71 70 59 86 60 93 27 94 72 82 42 14 97 59 24 68 67 38 34 55 28 2 63 12 51 25 9 4 88 58 88 55 59 29 
0 1 85 162 235 243 304 356 398 407 475 544 567 622 633 721 790 866 938 955 978 1051 1073 1121 1154 1180 1233 1240 1277 1294 1303 1360 1453 1517 1584 1668 1708 1738 1754 1850 1929 1941 1998 2039 2067 2072 2105 2113 2122 2130 2150 2216 2291 2362 2375 2466 2511 2578 2599 2670 2740 2799 2885 2945 3038 3065 3159 3231 3313 3355 3369 3466 3525 3549 3617 3684 3722 3756 3811 3839 3841 3904 3916 3967 3992 4001 4005 4093 4151 4239 4294 4353 4382 4455 4486 4577 4630 4720 4798 4876 4910 
RR Average Time: 2341.2
BUILD SUCCESSFUL (total time: 0 seconds)

1 80 23 46 87 46 77 66 75 19 99 22 100 17 35 38 62 39 13 93 88 52 1 42 60 51 54 25 46 85 12 22 20 24 23 39 3 68 96 17 40 27 41 19 22 50 2 96 69 57 93 88 10 81 99 58 31 70 64 69 38 31 62 56 9 54 29 37 54 12 64 19 43 18 91 28 25 49 51 8 58 83 6 63 61 51 62 18 2 93 11 98 92 51 20 99 62 97 54 18 
0 1 81 104 150 237 283 360 426 501 520 619 641 741 758 793 831 893 932 945 1038 1126 1178 1179 1221 1281 1332 1386 1411 1457 1542 1554 1576 1596 1620 1643 1682 1685 1753 1849 1866 1906 1933 1974 1993 2015 2065 2067 2163 2232 2289 2382 2470 2480 2561 2660 2718 2749 2819 2883 2952 2990 3021 3083 3139 3148 3202 3231 3268 3322 3334 3398 3417 3460 3478 3569 3597 3622 3671 3722 3730 3788 3871 3877 3940 4001 4052 4114 4132 4134 4227 4238 4336 4428 4479 4499 4598 4660 4757 4811 
FIFO Average Time: 2364.46

1 80 23 46 87 46 77 66 75 19 99 22 100 17 35 38 62 39 13 93 88 52 1 42 60 51 54 25 46 85 12 22 20 24 23 39 3 68 96 17 40 27 41 19 22 50 2 96 69 57 93 88 10 81 99 58 31 70 64 69 38 31 62 56 9 54 29 37 54 12 64 19 43 18 91 28 25 49 51 8 58 83 6 63 61 51 62 18 2 93 11 98 92 51 20 99 62 97 54 18 
0 1 2 4 6 9 15 23 32 42 53 65 77 90 107 124 142 160 178 197 216 235 255 275 297 319 341 364 387 411 436 461 488 516 545 576 607 642 679 717 755 794 833 873 914 956 999 1045 1091 1137 1186 1236 1287 1338 1389 1440 1492 1546 1600 1654 1708 1764 1821 1879 1937 1997 2058 2120 2182 2244 2306 2369 2433 2497 2563 2631 2700 2769 2839 2914 2991 3071 3152 3235 3320 3407 3495 3583 3674 3766 3859 3952 4045 4141 4237 4334 4432 4531 4630 4729 
SJF Average Time: 1559.74

// for increment of 5 units approximately the same as 20 units
1 80 23 46 87 46 77 66 75 19 99 22 100 17 35 38 62 39 13 93 88 52 1 42 60 51 54 25 46 85 12 22 20 24 23 39 3 68 96 17 40 27 41 19 22 50 2 96 69 57 93 88 10 81 99 58 31 70 64 69 38 31 62 56 9 54 29 37 54 12 64 19 43 18 91 28 25 49 51 8 58 83 6 63 61 51 62 18 2 93 11 98 92 51 20 99 62 97 54 18 
0 1 81 104 150 237 283 360 426 501 520 619 641 741 758 793 831 893 932 945 1038 1126 1178 1179 1221 1281 1332 1386 1411 1457 1542 1554 1576 1596 1620 1643 1682 1685 1753 1849 1866 1906 1933 1974 1993 2015 2065 2067 2163 2232 2289 2382 2470 2480 2561 2660 2718 2749 2819 2883 2952 2990 3021 3083 3139 3148 3202 3231 3268 3322 3334 3398 3417 3460 3478 3569 3597 3622 3671 3722 3730 3788 3871 3877 3940 4001 4052 4114 4132 4134 4227 4238 4336 4428 4479 4499 4598 4660 4757 4811 4829 
RR Average Time: 2364.46
BUILD SUCCESSFUL (total time: 0 seconds)

*/