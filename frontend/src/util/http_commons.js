import axios from 'axios'

export const AXIOS = axios.create({
  baseURL: `/calc`
})