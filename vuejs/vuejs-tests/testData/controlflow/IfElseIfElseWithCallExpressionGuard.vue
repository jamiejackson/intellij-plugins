<script setup lang="ts">
function createUnion<T>(): number | string | number[] {
  const r = Math.random();
  return r > 0.66 ? 42 : (r > 0.33 ? "hello" : [1, 2, 3]) ;
}

let union = createUnion();
</script>

<template>
  <section>
    <div v-if="typeof union === 'number'">
      <span v-text="union.toFixed()"></span>
      <span v-text="union.<weak_warning descr="Unresolved function or method join()">join</weak_warning>(`, `)"></span>
      <span v-text="union.<weak_warning descr="Unresolved function or method toUpperCase()">toUpperCase</weak_warning>()"></span>
    </div>
    <div v-else-if="Array.isArray(union)">
      <span v-text="union.<weak_warning descr="Unresolved function or method toFixed()">toFixed</weak_warning>()"></span>
      <span v-text="union.join(`, `)"></span>
      <span v-text="union.<weak_warning descr="Unresolved function or method toUpperCase()">toUpperCase</weak_warning>()"></span>
    </div>
    <div v-else>
      <span v-text="union.<weak_warning descr="Unresolved function or method toFixed()">toFixed</weak_warning>()"></span>
      <span v-text="union.<weak_warning descr="Unresolved function or method join()">join</weak_warning>(`, `)"></span>
      <span v-text="union.toUpperCase()"></span>
    </div>
  </section>
</template>
