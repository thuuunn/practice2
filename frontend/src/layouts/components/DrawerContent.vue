<script setup>
import {
  VerticalNavLink,
  VerticalNavSectionTitle,
} from '@layouts'
</script>

<template>
    <ul>
        <VerticalNavSectionTitle :item="{ heading: '앱' }" />
        <VerticalNavLink
            :item="{
                title: '주문',
                to: '/주문',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: '가게' }" />
        <VerticalNavLink
            :item="{
                title: '주문처리',
                to: '/주문처리',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: '결제' }" />
        <VerticalNavLink
            :item="{
                title: '결제',
                to: '/결제',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: '배달' }" />
        <VerticalNavSectionTitle :item="{ heading: 'BoundedContext1216' }" />
    </ul>
</template>
