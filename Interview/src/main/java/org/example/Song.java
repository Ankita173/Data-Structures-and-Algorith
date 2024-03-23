package org.example;

import java.io.IOException;
import java.util.*;


public class Song {
    public static void main(String[] args) throws IOException {
        List<Integer> connection_to = Arrays.asList(818, 444, 184, 906, 626, 51, 712, 189, 856, 760, 86, 673, 321, 14, 645, 487, 839, 759, 902, 858, 581, 774, 215, 359, 410, 807, 907, 894, 200, 701, 403, 501, 41, 935, 95, 261, 983, 586, 735, 3, 185, 721, 570, 474, 660, 346, 394, 565, 238, 218, 606, 437, 278, 949, 398, 7, 631, 817, 507, 457, 440, 979, 652, 862, 841, 174, 576, 636, 187, 71, 70, 211, 650, 938, 232, 799, 633, 411, 988, 417, 114, 617, 653, 60, 529, 352, 683, 253, 639, 539, 629, 429, 257, 827, 59, 214, 295, 78, 26, 130, 58, 620, 521, 958, 109, 299, 415, 552, 541, 671, 381, 364, 964, 397, 503, 787, 621, 405, 13, 682, 340, 247, 334, 599, 132, 441, 430, 769, 351, 778, 915, 350, 234, 180, 929, 328, 177, 954, 637, 281, 203, 713, 345, 377, 236, 849, 644, 190, 963, 447, 603, 517, 664, 536, 480, 409, 743, 56, 252, 482, 230, 2, 948, 149, 757, 538, 680, 967, 94, 407, 136, 1000, 27, 108, 74, 600, 84, 349, 263, 413, 560, 237, 733, 549, 514, 325, 662, 946, 548, 544, 989, 472, 924, 221, 865, 873, 746, 937, 684, 164, 360, 22, 575, 785, 875, 38, 332, 97, 927, 767, 284, 266, 588, 634, 271, 491, 867, 304, 465, 426, 942, 379, 103, 47, 280, 458, 106, 155, 421, 167, 880, 825, 5, 729, 943, 593, 604, 755, 939, 42, 77, 740, 147, 747, 470, 508, 981, 121, 162, 823, 343, 840, 694, 39, 810, 283, 425, 877, 300, 348, 419, 20, 481, 191, 750, 383, 751, 956, 311, 535, 166, 443, 250, 209, 756, 826, 727, 936, 301, 666, 373, 241, 399, 982, 216, 722, 342, 54, 646, 497, 227, 897, 32, 957, 401, 210, 800, 782, 90, 616, 486, 1, 960, 91, 753, 550, 240, 79, 148, 151, 395, 829, 675, 670, 34, 194, 868, 911, 438, 455, 607, 453, 223, 427, 952, 484, 408, 336, 488, 235, 635, 935, 45, 585, 624, 515, 619, 387, 925, 125, 622, 561, 641, 309, 850, 648, 19, 814, 439, 339, 699, 423, 146, 892, 435, 141, 779, 876, 693, 574, 206, 183, 719, 186, 506, 707, 135, 105, 15, 908, 265, 87, 540, 153, 726, 391, 647, 883, 156, 846, 974, 899, 563, 371, 864, 113, 821, 889, 10, 887, 25, 703, 170, 80, 728, 584, 879, 690, 758, 123, 820, 580, 532, 293, 959, 522, 335, 492, 46, 618, 792, 998, 975, 656, 369, 613, 326, 289, 667, 681, 628, 723, 783, 33, 847, 881, 412, 725, 992, 748, 324, 566, 389, 461, 777, 500, 980, 596, 402, 192, 940, 704, 128, 863, 422, 29, 848, 824, 890, 732, 679, 400, 81, 893, 169, 233, 150, 406, 152, 569, 962, 558, 816, 66, 100, 329, 990, 643, 442, 361, 610, 764, 188, 495, 374, 573, 837, 448, 314, 904, 688, 73, 224, 663, 742, 258, 246, 768, 689, 75, 527, 137, 547, 815, 804, 96, 282, 583, 919, 23, 490, 157, 615, 126, 567, 112, 428, 950, 914, 36, 229, 994, 594, 404, 717, 464, 4, 243, 691, 590, 139, 546, 354, 165, 678, 104, 878, 523, 179, 534, 254, 922, 668, 802, 718, 370, 537, 131, 159, 923, 968, 752, 854, 734, 627, 173, 368, 242, 35, 611, 388, 870, 869, 498, 832, 572, 977, 120, 698, 302, 288, 896, 944, 741, 842, 543, 52, 898, 181, 154, 478, 871, 993, 386, 320, 788, 88, 525, 554, 860, 736, 469, 614, 89, 674, 331, 808, 92, 178, 524, 655, 780, 452, 843, 493, 930, 809, 275, 976, 658, 193, 196, 775, 771, 57, 17, 687, 773, 955, 951, 110, 228, 609, 446, 62, 202, 260, 382, 454, 124, 933, 226, 303, 451, 790, 308, 313, 251, 657, 322, 367, 37, 568, 513, 793, 306, 499, 317, 789, 143, 805, 781, 737, 12, 163, 161, 182, 294, 204, 957, 297, 355, 144, 630, 119, 511, 330, 471, 63, 984, 971, 926, 28, 231, 987, 562, 763, 115, 731, 665, 219, 61, 838, 934, 43, 82, 632, 872, 449, 830, 874, 176, 672, 697, 888, 852, 916, 510, 463, 625, 460, 327, 44, 882, 754, 468, 941, 912, 239, 269, 857, 494, 597, 520, 134, 93, 986, 831, 55, 861, 695, 279, 516, 661, 9, 418, 714, 244, 677, 784, 384, 21, 30, 845, 287, 973, 556, 424, 249, 601, 844, 99, 390, 475, 393, 795, 716, 612, 965, 931, 365, 220, 972, 372, 996, 551, 961, 692, 709, 859, 53, 913, 129, 6, 738, 705, 794, 791, 49, 772, 479, 312, 310, 669, 762, 711, 739, 11, 72, 205, 886, 201, 905, 357, 477, 835, 505, 111, 903, 512, 591, 564, 884, 385, 921, 315, 587, 855, 720, 118, 392, 198, 901, 686, 766, 85, 667, 813, 366, 706, 270, 577, 853, 323, 363, 171, 765, 434, 724, 715, 945, 462, 999, 16, 649, 502, 213, 920, 142, 542, 456, 833, 337, 307, 970, 24, 797, 420, 910, 40, 685, 277, 432, 298, 640, 866, 273, 545, 102, 64, 133, 947, 445, 101, 526, 376, 812, 248, 528, 431, 222, 380, 953, 589, 676, 362, 267, 819, 245, 730, 466, 555, 290, 592, 531, 291, 240, 318, 160, 219, 356, 496, 623, 749, 436, 296, 262, 138, 776, 891, 272, 195, 702, 208, 659, 69, 834, 217, 145, 353, 909, 416, 602, 582, 347, 68, 8, 651, 932, 796, 378, 64, 786, 836, 358, 473, 341, 811, 828, 50, 319, 259, 985, 286, 608, 969, 822, 240, 518, 991, 264, 696, 918, 127, 18, 450, 744, 595, 519, 175, 776, 770, 553, 433, 172, 995, 469, 895, 212, 489, 708, 476, 292, 571, 557, 117, 509, 530, 122, 467, 158, 65, 459, 76, 928, 710, 483, 67, 375, 579, 268, 700, 316, 116, 338, 533, 559, 31, 414, 107, 197, 285, 199, 638, 851, 276, 598, 966, 207, 917, 333, 997, 396, 274, 978, 745, 48, 806, 98, 485, 605, 801, 83, 798, 140, 885, 900, 578, 654, 305);


        List<Integer> connection_from = Arrays.asList(700, 419, 429, 152, 595, 187, 816, 916, 12, 300, 157, 459, 247, 266, 421, 982, 664, 347, 636, 646, 54, 930, 573, 411, 711, 274, 724, 234, 141, 738, 515, 305, 106, 872, 893, 758, 494, 343, 832, 837, 859, 706, 721, 373, 422, 325, 378, 858, 935, 21, 263, 155, 218, 623, 686, 278, 62, 403, 819, 376, 879, 188, 310, 104, 330, 950, 345, 674, 450, 614, 120, 590, 148, 555, 813, 997, 545, 900, 944, 771, 795, 624, 567, 818, 53, 783, 219, 554, 638, 725, 36, 599, 969, 427, 978, 342, 101, 955, 191, 489, 440, 364, 606, 920, 26, 792, 432, 4, 223, 596, 353, 442, 276, 579, 785, 311, 108, 602, 214, 269, 238, 64, 67, 727, 163, 128, 873, 821, 905, 355, 8, 81, 539, 292, 30, 94, 902, 483, 185, 387, 772, 126, 548, 981, 66, 733, 199, 550, 224, 866, 690, 972, 933, 174, 622, 352, 665, 723, 11, 648, 49, 659, 853, 350, 617, 497, 984, 416, 971, 102, 503, 746, 509, 502, 423, 544, 76, 59, 111, 687, 374, 13, 763, 896, 466, 786, 634, 69, 211, 169, 85, 741, 295, 929, 529, 865, 702, 201, 848, 424, 876, 589, 764, 397, 51, 70, 398, 286, 346, 180, 913, 577, 434, 782, 872, 685, 810, 134, 508, 222, 947, 381, 768, 414, 512, 253, 14, 652, 467, 992, 834, 535, 655, 751, 100, 928, 204, 447, 850, 495, 825, 656, 322, 970, 531, 77, 667, 575, 1000, 232, 613, 754, 611, 799, 133, 158, 281, 707, 507, 542, 233, 226, 143, 541, 103, 852, 356, 293, 412, 849, 312, 147, 958, 386, 162, 681, 740, 518, 580, 863, 368, 58, 200, 307, 625, 777, 370, 917, 436, 886, 349, 739, 806, 767, 538, 472, 712, 388, 235, 846, 770, 737, 492, 254, 828, 351, 344, 251, 451, 296, 207, 601, 498, 243, 653, 847, 750, 668, 262, 506, 458, 446, 528, 237, 110, 841, 965, 125, 415, 283, 803, 878, 227, 132, 924, 713, 74, 885, 975, 574, 176, 19, 808, 405, 327, 820, 526, 407, 288, 358, 773, 964, 989, 553, 242, 228, 449, 860, 615, 998, 217, 892, 301, 324, 47, 676, 29, 734, 402, 838, 875, 774, 598, 854, 287, 244, 161, 523, 566, 760, 993, 953, 329, 105, 895, 988, 563, 781, 215, 949, 520, 695, 765, 844, 319, 391, 452, 732, 431, 793, 842, 96, 401, 801, 812, 246, 698, 268, 855, 139, 273, 23, 570, 43, 880, 284, 817, 836, 779, 683, 927, 418, 501, 974, 270, 757, 389, 280, 473, 122, 57, 620, 267, 877, 827, 338, 231, 35, 478, 480, 290, 339, 908, 769, 131, 371, 742, 309, 999, 490, 938, 379, 959, 462, 15, 588, 581, 910, 65, 831, 647, 829, 455, 525, 168, 787, 657, 637, 487, 940, 328, 640, 5, 275, 603, 79, 477, 540, 202, 433, 912, 140, 918, 48, 963, 488, 654, 780, 481, 561, 170, 334, 195, 460, 28, 728, 341, 663, 753, 591, 406, 482, 585, 824, 166, 361, 874, 716, 384, 181, 513, 730, 957, 348, 317, 323, 715, 658, 798, 92, 118, 206, 986, 137, 73, 160, 156, 264, 83, 939, 925, 117, 333, 479, 956, 985, 136, 511, 88, 714, 552, 87, 551, 426, 543, 840, 671, 340, 862, 807, 294, 249, 159, 788, 78, 189, 735, 272, 282, 258, 521, 884, 304, 444, 124, 98, 578, 696, 527, 894, 261, 485, 335, 556, 318, 61, 533, 887, 861, 867, 213, 455, 25, 366, 962, 203, 10, 18, 678, 367, 811, 109, 833, 99, 396, 672, 691, 177, 208, 114, 265, 701, 514, 881, 901, 303, 468, 990, 129, 493, 196, 744, 946, 377, 453, 909, 784, 720, 44, 755, 86, 142, 404, 259, 593, 209, 316, 84, 337, 560, 135, 519, 684, 719, 80, 954, 320, 756, 673, 464, 794, 173, 945, 576, 608, 20, 332, 504, 710, 226, 942, 839, 277, 186, 360, 484, 1, 138, 815, 604, 616, 516, 9, 532, 167, 443, 27, 898, 127, 145, 450, 705, 248, 63, 474, 457, 469, 869, 306, 976, 369, 804, 941, 471, 56, 759, 375, 236, 445, 417, 736, 796, 805, 675, 470, 731, 857, 558, 357, 871, 216, 645, 271, 642, 75, 745, 845, 107, 395, 743, 408, 630, 115, 680, 198, 491, 68, 802, 299, 534, 979, 465, 948, 766, 172, 505, 749, 669, 31, 943, 500, 439, 60, 197, 380, 298, 571, 178, 393, 600, 97, 594, 635, 697, 40, 983, 37, 171, 583, 977, 633, 967, 413, 194, 547, 517, 914, 568, 644, 113, 621, 16, 252, 689, 112, 175, 121, 704, 382, 41, 524, 363, 618, 183, 82, 926, 797, 205, 899, 915, 889, 856, 164, 45, 610, 456, 826, 632, 399, 130, 564, 245, 708, 936, 559, 42, 597, 297, 448, 165, 372, 586, 718, 359, 230, 609, 584, 425, 71, 692, 748, 354, 966, 123, 221, 454, 6, 693, 89, 587, 510, 285, 499, 923, 937, 961, 153, 994, 814, 951, 151, 95, 651, 212, 336, 890, 46, 239, 149, 225, 996, 897, 643, 921, 385, 762, 619, 326, 392, 790, 631, 279, 778, 649, 475, 52, 888, 400, 628, 626, 536, 437, 864, 907, 911, 677, 344, 639, 116, 629, 179, 91, 791, 428, 146, 315, 934, 891, 335, 931, 257, 365, 670, 537, 919, 530, 641, 210, 904, 679, 241, 255, 461, 302, 22, 980, 55, 699, 883, 607, 182, 247, 546, 557, 726, 843, 747, 308, 314, 496, 835, 722, 50, 463, 144, 703, 776, 344, 660, 709, 960, 906, 383, 34, 394, 666, 435, 922, 313, 522, 150, 260, 662, 682, 627, 289, 390, 612, 694, 409, 3, 420, 430, 154, 2, 830, 729, 592, 192, 800, 291, 190, 987, 38, 562, 438, 995, 476, 90, 717, 549, 822, 932, 441, 851, 789, 868, 486, 903, 362, 193, 72, 410, 250, 973, 582, 870, 32, 17, 952, 688, 7, 775, 184, 119, 572, 229, 33, 93, 220, 991, 39, 605, 823, 661, 809, 569, 650, 882, 331);


        List<Integer> queries = Arrays.asList(74, 332, 757, 16, 118, 709, 358, 810, 200, 735, 87, 480, 488, 7, 490, 2, 928, 539, 744, 494, 536, 733, 284, 285, 768, 72, 822, 431, 387, 786, 324, 59, 418, 328, 384, 242, 213, 939, 826, 875, 375, 252, 339, 398, 713, 718, 634, 899, 412, 864, 801, 173, 966, 675, 203, 796, 393, 761, 454, 696, 664, 449, 602, 401, 279, 773, 915, 308, 180, 766, 778, 119, 214, 505, 320, 116, 193, 965, 960, 678, 729, 521, 755, 865, 19);

        getVisibleProfilesCount(5, connection_from, connection_to,  queries);
    }
    public static List<Integer> getVisibleProfilesCount(int connection_nodes, List<Integer> connection_from, List<Integer> connection_to, List<Integer> queries) {
        Set<Integer> mutualProfile = new HashSet<>();
        List<Set<Integer>> profileSet = new ArrayList<>();

        for (int i = 0; i < connection_from.size(); i++) {
            if(mutualProfile.contains(connection_from.get(i)) || mutualProfile.contains(connection_to.get(i))) {
                for (Set<Integer> set : profileSet) {
                    if(set.contains(connection_from.get(i)) || set.contains(connection_to.get(i))) {
                        set.add(connection_from.get(i));
                        set.add(connection_to.get(i));
                        break;
                    }
                }
            } else {
                Set<Integer> set = new HashSet<>();
                set.add(connection_from.get(i));
                set.add(connection_to.get(i));
                profileSet.add(set);

            }
            mutualProfile.add(connection_from.get(i));
            mutualProfile.add(connection_to.get(i));
        }
        List<Integer> visible = new ArrayList<>();
        for (int query : queries) {
            if (mutualProfile.contains(query)) {
                for (Set<Integer> set : profileSet) {
                    if(set.contains(query)) {
                        visible.add(set.size());
                        break;
                    }
                }
            } else {
                visible.add(1);
            }
        }
        return visible;
    }

}


