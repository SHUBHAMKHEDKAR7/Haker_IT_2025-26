import { defineSchema, defineTable } from "convex/server";
import { v } from "convex/values";
import { authTables } from "@convex-dev/auth/server";

const applicationTables = {
  categories: defineTable({
    name: v.string(),
    slug: v.string(),
    description: v.string(),
    image: v.string(),
  }).index("by_slug", ["slug"]),

  products: defineTable({
    name: v.string(),
    categoryId: v.id("categories"),
    description: v.string(),
    specifications: v.array(v.object({
      key: v.string(),
      value: v.string(),
    })),
    image: v.string(),
    price: v.optional(v.string()),
    featured: v.boolean(),
  }).index("by_category", ["categoryId"])
    .index("by_featured", ["featured"]),

  queries: defineTable({
    name: v.string(),
    phone: v.string(),
    email: v.string(),
    product: v.string(),
    message: v.string(),
    status: v.string(), // "pending", "responded"
    userId: v.optional(v.id("users")),
  }).index("by_user", ["userId"]),

  ratings: defineTable({
    customerName: v.string(),
    rating: v.number(),
    review: v.string(),
    product: v.optional(v.string()),
  }),
};

export default defineSchema({
  ...authTables,
  ...applicationTables,
});
