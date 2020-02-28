package com.vengets.algos;

import com.vengets.models.Sort;

public class MergeSort implements Sort {

    @Override
    public void sort(int[] itemsToBeSorted, int size) {
        mergeSort(itemsToBeSorted, size);
    }

    private void mergeSort(int[] ar, int n) {
        if (n < 2) return;
        int mid = n / 2;
        int r = n - mid;

        int[] left = new int[mid];
        int[] right = new int[r];

        for (int i = 0; i < mid; i++) {
            left[i] = ar[i];
        }
        for (int i = 0; i < r; i++) {
            right[i] = ar[mid + i];
        }

        mergeSort(left, mid);
        mergeSort(right, r);

        merge(ar, left, right, mid, r);
    }

    private void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
