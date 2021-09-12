import { Saller } from "./seller"

export type SaleSum = {
    sellerName: string;
    sum: number;
}

export type SaleSuccess = {
    sellerName: string;
    visited: number;
    deals: number;
}

export type Sale = {
    id: number;
    visited: number;
    deals: number;
    amount: number;
    date: string;
    saller: Saller;
}

export type SalePage = {
    content?: Sale[];
    last?: boolean;
    totalPages?: number;
    totalElements?: number;
    numberOfElements?: number;
    first?: boolean;
    size?: number;
    number?: number;
    empty?: boolean;
}