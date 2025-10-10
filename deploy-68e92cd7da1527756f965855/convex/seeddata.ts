import { mutation } from "./_generated/server";

export const seedDatabase = mutation({
  args: {},
  handler: async (ctx) => {
    // Clear existing data
    const existingCategories = await ctx.db.query("categories").collect();
    for (const category of existingCategories) {
      await ctx.db.delete(category._id);
    }
    
    const existingProducts = await ctx.db.query("products").collect();
    for (const product of existingProducts) {
      await ctx.db.delete(product._id);
    }

    const existingRatings = await ctx.db.query("ratings").collect();
    for (const rating of existingRatings) {
      await ctx.db.delete(rating._id);
    }

    // Seed categories
    const categories = [
      {
        name: "Openwell Pumpset",
        slug: "openwell-pumpset",
        description: "High-quality openwell pumpsets for various applications",
        image: "https://images.unsplash.com/photo-1581092160562-40aa08e78837?w=400&h=300&fit=crop"
      },
      {
        name: "Vertical Openwell Pumpset",
        slug: "vertical-openwell-pumpset",
        description: "Vertical openwell pumpsets for deep water extraction",
        image: "https://images.unsplash.com/photo-1558618666-fcd25c85cd64?w=400&h=300&fit=crop"
      },
      {
        name: "V3 Submersible Pumpset",
        slug: "v3-submersible-pumpset",
        description: "V3 submersible pumpsets for residential use",
        image: "https://images.unsplash.com/photo-1504328345606-18bbc8c9d7d1?w=400&h=300&fit=crop"
      },
      {
        name: "V4 Submersible Pumpset",
        slug: "v4-submersible-pumpset",
        description: "V4 submersible pumpsets for commercial applications",
        image: "https://images.unsplash.com/photo-1581092160562-40aa08e78837?w=400&h=300&fit=crop"
      },
      {
        name: "V5 Submersible Pumpset",
        slug: "v5-submersible-pumpset",
        description: "V5 submersible pumpsets for industrial use",
        image: "https://images.unsplash.com/photo-1558618666-fcd25c85cd64?w=400&h=300&fit=crop"
      },
      {
        name: "V6 to V7 Submersible Pumpset",
        slug: "v6-v7-submersible-pumpset",
        description: "High-capacity V6 to V7 submersible pumpsets",
        image: "https://images.unsplash.com/photo-1504328345606-18bbc8c9d7d1?w=400&h=300&fit=crop"
      },
      {
        name: "V8 Submersible Pumpset",
        slug: "v8-submersible-pumpset",
        description: "Heavy-duty V8 submersible pumpsets",
        image: "https://images.unsplash.com/photo-1581092160562-40aa08e78837?w=400&h=300&fit=crop"
      },
      {
        name: "Domestic Series",
        slug: "domestic-series",
        description: "Domestic water pumps for household use",
        image: "https://images.unsplash.com/photo-1558618666-fcd25c85cd64?w=400&h=300&fit=crop"
      },
      {
        name: "Centrifugal Monoblock Pumpset",
        slug: "centrifugal-monoblock-pumpset",
        description: "Efficient centrifugal monoblock pumpsets",
        image: "https://images.unsplash.com/photo-1504328345606-18bbc8c9d7d1?w=400&h=300&fit=crop"
      },
      {
        name: "PVC Insulation Tape",
        slug: "pvc-insulation-tape",
        description: "High-quality PVC insulation tapes",
        image: "https://images.unsplash.com/photo-1581092160562-40aa08e78837?w=400&h=300&fit=crop"
      },
      {
        name: "Cable",
        slug: "cable",
        description: "Electrical cables for various applications",
        image: "https://images.unsplash.com/photo-1558618666-fcd25c85cd64?w=400&h=300&fit=crop"
      }
    ];

    const categoryIds = [];
    for (const category of categories) {
      const id = await ctx.db.insert("categories", category);
      categoryIds.push({ ...category, id });
    }

    // Seed products for each category
    const products = [
      // Openwell Pumpset
      {
        name: "OW-100 Openwell Pump",
        categorySlug: "openwell-pumpset",
        description: "High-efficiency openwell pump suitable for irrigation and domestic use",
        specifications: [
          { key: "Power", value: "1 HP" },
          { key: "Head", value: "30-50 meters" },
          { key: "Discharge", value: "100-150 LPM" },
          { key: "Material", value: "Cast Iron" }
        ],
        image: "https://images.unsplash.com/photo-1581092160562-40aa08e78837?w=400&h=300&fit=crop",
        featured: true
      },
      {
        name: "OW-200 Heavy Duty Openwell Pump",
        categorySlug: "openwell-pumpset",
        description: "Heavy-duty openwell pump for industrial applications",
        specifications: [
          { key: "Power", value: "2 HP" },
          { key: "Head", value: "40-70 meters" },
          { key: "Discharge", value: "200-300 LPM" },
          { key: "Material", value: "Stainless Steel" }
        ],
        image: "https://images.unsplash.com/photo-1581092160562-40aa08e78837?w=400&h=300&fit=crop",
        featured: false
      },
      // V3 Submersible
      {
        name: "V3-75 Submersible Pump",
        categorySlug: "v3-submersible-pumpset",
        description: "Compact V3 submersible pump for residential water supply",
        specifications: [
          { key: "Power", value: "0.75 HP" },
          { key: "Head", value: "25-40 meters" },
          { key: "Discharge", value: "80-120 LPM" },
          { key: "Bore Size", value: "3 inch" }
        ],
        image: "https://images.unsplash.com/photo-1504328345606-18bbc8c9d7d1?w=400&h=300&fit=crop",
        featured: true
      },
      {
        name: "V3-100 Submersible Pump",
        categorySlug: "v3-submersible-pumpset",
        description: "Reliable V3 submersible pump with enhanced performance",
        specifications: [
          { key: "Power", value: "1 HP" },
          { key: "Head", value: "30-50 meters" },
          { key: "Discharge", value: "100-150 LPM" },
          { key: "Bore Size", value: "3 inch" }
        ],
        image: "https://images.unsplash.com/photo-1504328345606-18bbc8c9d7d1?w=400&h=300&fit=crop",
        featured: false
      },
      // V4 Submersible
      {
        name: "V4-150 Submersible Pump",
        categorySlug: "v4-submersible-pumpset",
        description: "High-performance V4 submersible pump for commercial use",
        specifications: [
          { key: "Power", value: "1.5 HP" },
          { key: "Head", value: "35-60 meters" },
          { key: "Discharge", value: "150-250 LPM" },
          { key: "Bore Size", value: "4 inch" }
        ],
        image: "https://images.unsplash.com/photo-1581092160562-40aa08e78837?w=400&h=300&fit=crop",
        featured: true
      },
      // Domestic Series
      {
        name: "DS-50 Domestic Pump",
        categorySlug: "domestic-series",
        description: "Compact domestic pump for household water supply",
        specifications: [
          { key: "Power", value: "0.5 HP" },
          { key: "Head", value: "20-35 meters" },
          { key: "Discharge", value: "60-100 LPM" },
          { key: "Type", value: "Self Priming" }
        ],
        image: "https://images.unsplash.com/photo-1558618666-fcd25c85cd64?w=400&h=300&fit=crop",
        featured: true
      },
      // PVC Insulation Tape
      {
        name: "PVC Tape - Premium Quality",
        categorySlug: "pvc-insulation-tape",
        description: "High-quality PVC insulation tape for electrical applications",
        specifications: [
          { key: "Width", value: "19mm" },
          { key: "Length", value: "20 meters" },
          { key: "Thickness", value: "0.13mm" },
          { key: "Color", value: "Multiple Colors" }
        ],
        image: "https://images.unsplash.com/photo-1581092160562-40aa08e78837?w=400&h=300&fit=crop",
        featured: false
      },
      // Cable
      {
        name: "Copper Cable - 2.5 sq mm",
        categorySlug: "cable",
        description: "High-grade copper cable for electrical installations",
        specifications: [
          { key: "Size", value: "2.5 sq mm" },
          { key: "Material", value: "Pure Copper" },
          { key: "Insulation", value: "PVC" },
          { key: "Length", value: "90 meters" }
        ],
        image: "https://images.unsplash.com/photo-1558618666-fcd25c85cd64?w=400&h=300&fit=crop",
        featured: true
      }
    ];

    for (const product of products) {
      const category = categoryIds.find(cat => cat.slug === product.categorySlug);
      if (category) {
        await ctx.db.insert("products", {
          name: product.name,
          categoryId: category.id,
          description: product.description,
          specifications: product.specifications,
          image: product.image,
          featured: product.featured
        });
      }
    }

    // Seed ratings
    const ratings = [
      {
        customerName: "Rajesh Patil",
        rating: 5,
        review: "Excellent quality pumps! Been using for 3 years without any issues.",
        product: "V3 Submersible Pump"
      },
      {
        customerName: "Sunita Sharma",
        rating: 5,
        review: "Great service and reliable products. Highly recommended!",
        product: "Domestic Series"
      },
      {
        customerName: "Amit Kumar",
        rating: 4,
        review: "Good quality products at reasonable prices. Quick delivery.",
        product: "Openwell Pump"
      },
      {
        customerName: "Priya Desai",
        rating: 5,
        review: "Professional service and excellent after-sales support.",
        product: "V4 Submersible"
      },
      {
        customerName: "Mahesh Joshi",
        rating: 5,
        review: "Best electrical hardware shop in the area. Trusted quality.",
      }
    ];

    for (const rating of ratings) {
      await ctx.db.insert("ratings", rating);
    }

    return "Database seeded successfully!";
  },
});
